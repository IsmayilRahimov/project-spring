package org.example.projectspring.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.projectspring.service.ProjectService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    @Override
    public String printHello() {
        return "Hello from Project Service";
    }

}
