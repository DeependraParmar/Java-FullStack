package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @Column(name = "emp_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "emp_name", nullable = false)
    private String name;

    @Column(name = "emp_email", nullable = false, unique = true)
    private String email;

    @Column(name = "emp_salary")
    private Float salary;

    @ManyToOne
    @JoinColumn(name = "emp_department")
    private Department department;
}
