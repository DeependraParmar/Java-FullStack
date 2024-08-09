package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empinfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @Column(name = "emp_id")
    private Integer id;

    @Column(name = "emp_name", nullable = false)
    private String name;

    @Column(name = "emp_age", nullable = false)
    private int age;

    @Column(name = "emp_city", nullable = true)
    private String city;

    @Column(name = "emp_email", nullable = false, unique = true)
    private String email;

    @Column(name = "emp_salary", nullable = false)
    private Float salary;
}
