package org.example.service;

import org.example.domain.Department;
import org.example.repository.DepartmentRepository;

import java.util.List;

public class DepartmentService {

    public List<Department> getAllProjects() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        return departmentRepository.findAll();
    }
}
