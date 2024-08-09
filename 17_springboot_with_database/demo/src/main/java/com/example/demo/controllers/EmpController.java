package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/list")
    public ApiResponse list() {
        List<Employee> data = employeeRepo.findAll();
        return new ApiResponse(true, data, "Employee Records");
    }
    
    
}
