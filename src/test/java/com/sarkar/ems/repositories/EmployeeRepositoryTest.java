package com.sarkar.ems.repositories;

import com.sarkar.ems.models.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void findByEmployeeIdTest() {
        Employee employee = Employee.builder()
                .name("Sourabh Sarkar")
                .position("Chief Technology Officer (CTO)")
                .office("Mumbai")
                .age(31)
                .startDate(LocalDate.of(2015,3,23))
                .salary(1200000.00)
                .build();

        Employee returnedEmployee = employeeRepository.save(employee);
        assertEquals(employee.getId(), returnedEmployee.getId());
    }
}