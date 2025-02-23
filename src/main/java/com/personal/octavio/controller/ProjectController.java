package com.personal.octavio.controller;

import com.personal.octavio.model.Project;
import com.personal.octavio.service.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {

    private ProjectService projectService;

    @GetMapping("/list")
    public ResponseEntity<List<Project>> list(){
        return ResponseEntity.ok(this.projectService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Project> getProject(@PathVariable final long id){
        return this.projectService.findOne(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
