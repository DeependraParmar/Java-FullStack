package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;
import java.util.List;
import java.util.Optional;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> { // Class & Type of Primary Key
    List<Employee> findAllByCity(String city);

    Optional<Employee> findByEmail(String email);

    List<Employee> findAllByAgeGreaterThan(Integer age);

    List<Employee> findAllByCityAndAgeGreaterThan(String city, Integer age);
}
