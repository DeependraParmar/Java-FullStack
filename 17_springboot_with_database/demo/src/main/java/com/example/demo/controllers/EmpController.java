package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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
    
    @PostMapping("/add")
    public ApiResponse save(@RequestBody Employee employee) {
        try{
            employeeRepo.save(employee); // used to save & update the data;
            return new ApiResponse(true, null, "Employee Added Successfully..");
        }
        catch(Exception e){
            return new ApiResponse(false, e.getMessage());
        }
    }
    
    @GetMapping("/{id}")
    public ApiResponse getEmployeeById(@PathVariable(value = "id") int id) {
        Optional<Employee> optional = employeeRepo.findById(id);
        if(optional.isPresent())
            return new ApiResponse(true, optional.get(), "Employee data fetched..");
        else
            return new ApiResponse(false, "Employee not found...");
    }
    
    @GetMapping("/test")
    public ApiResponse test() {
        // Object data = employeeRepo.findAll();

        // When you want data on the basis of custom params, you need to write custom query but, you have to get rid of writing queries.
        // In this case, you have take help of Repository.....
        // Define abstract methods in the interface and use all of them in the controllers.

        // Object data = employeeRepo.findAllByCity("Indore");

        // Object data = employeeRepo.findAllByAgeGreaterThan(10);

        Object data = employeeRepo.findAllByCityAndAgeGreaterThan("Indore",10);

        return new ApiResponse(true, data, "Testing....");
    }
    
}
