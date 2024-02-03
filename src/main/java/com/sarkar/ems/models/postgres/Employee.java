package com.sarkar.ems.models.postgres;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    @Column(name = "employee_id")
    private Long employeeId;

    private String name;
    private String office;
    private String position;
    private Integer age;
    private LocalDate startDate;
    private Double salary;

    private String username;
    private String password;

    // Audit
    @Column(nullable = false)
    private String createdBy;

    @Column(nullable = false)
    private LocalDate createdDate;

    private String updatedBy;
    private LocalDate updatedDate;


    @ManyToMany(/* cascade = CascadeType.ALL, */ fetch = FetchType.EAGER)
    @JoinTable(
            name = "employee_roles",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;

}
