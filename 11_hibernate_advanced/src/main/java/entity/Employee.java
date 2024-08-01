package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "emp_info")
public class Employee {
    @Id
    @Column(name = "emp_id")
    private Integer eid;

    @Column(name = "emp_name", nullable = false)
    private String name;

    @Column(name = "emp_age", nullable = false)
    private Integer age;

    @Column(name = "emp_email", nullable = false, unique = true)
    private String email;

    @Column(name = "emp_salary")
    private Float salary;

}
