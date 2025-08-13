package org.example.projectspring.controller;

import lombok.RequiredArgsConstructor;
import org.example.projectspring.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/projects")

public class ProjectController {
    private final ProjectService projectService;

    @GetMapping("/hello")
    public String hello() {
        return projectService.printHello();
    }
}
