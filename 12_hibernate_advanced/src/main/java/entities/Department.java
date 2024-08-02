package entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "department")
@Data
@NoArgsConstructor
public class Department {
    @Id
    @Column(name = "dep_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "dep_name", unique = true, nullable = false)
    private String name;

    @Column(name = "dep_location", nullable = false)
    private String location;

    public Department(String name, String location) {
        super();
        this.name = name;
        this.location = location;
    }
}