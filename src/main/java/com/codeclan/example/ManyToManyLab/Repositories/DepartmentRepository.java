package com.codeclan.example.ManyToManyLab.Repositories;

import com.codeclan.example.ManyToManyLab.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
