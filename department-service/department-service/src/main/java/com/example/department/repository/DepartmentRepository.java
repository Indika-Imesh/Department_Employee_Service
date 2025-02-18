package com.example.department.repository;

import com.example.department.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Explicitly mark it as a repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
