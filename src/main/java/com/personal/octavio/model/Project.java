package com.personal.octavio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Project {

    @Id
    private long id;
    private String name;
}
