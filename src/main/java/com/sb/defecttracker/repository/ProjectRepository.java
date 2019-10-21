package com.sb.defecttracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.defecttracker.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
