package com.sergio.portfolioweb.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sergio.portfolioweb.portfolio.models.Project;

@Repository
public interface ProjectRepository  extends JpaRepository<Project, Long>{
    
}
