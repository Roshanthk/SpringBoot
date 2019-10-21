package com.sb.defecttracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.defecttracker.model.Project;
import com.sb.defecttracker.repository.ProjectRepository;

@RestController
@RequestMapping("/api/v1")
public class ProjectController {
	
	@Autowired
	ProjectRepository projectRepository;
	
	@PostMapping(value="/project")
	public ResponseEntity<?> saveProject(@RequestBody Project project){
		projectRepository.save(project);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@GetMapping(value="/project")
	public List<Project> getProject(){
		return projectRepository.findAll();
	}

}
