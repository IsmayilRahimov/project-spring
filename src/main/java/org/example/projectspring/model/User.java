package org.example.projectspring.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "entity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String role;
}
