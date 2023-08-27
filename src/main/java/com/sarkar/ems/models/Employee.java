package com.sarkar.ems.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "EMPLOYEE")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String office;
    private String position;
    private Integer age;
    private LocalDate startDate;
    private Double salary;


    public Employee(String name, String office, String position, Integer age, LocalDate startDate, Double salary) {
        this.name = name;
        this.office = office;
        this.position = position;
        this.age = age;
        this.startDate = startDate;
        this.salary = salary;
    }

}
