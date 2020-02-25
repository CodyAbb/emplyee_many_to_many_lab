package com.codeclan.example.ManyToManyLab.Repositories;

import com.codeclan.example.ManyToManyLab.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
