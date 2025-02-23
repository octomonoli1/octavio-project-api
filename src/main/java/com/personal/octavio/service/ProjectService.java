package com.personal.octavio.service;

import com.personal.octavio.model.Project;
import com.personal.octavio.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProjectService {

    private ProjectRepository projectRepository;

    public List<Project> findAll(){
        return this.projectRepository.findAll();
    }

    public Optional<Project> findOne(final long id){
        return this.projectRepository.findById(id);
    }
}
