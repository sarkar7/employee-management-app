package com.sarkar.ems.repositories;

import com.sarkar.ems.models.postgres.Employee;
import com.sarkar.ems.models.postgres.Role;
import com.sarkar.ems.repositories.postgres.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void findByEmployeeIdTest() {
        Set<Role> roles = new HashSet<>();
        roles.add(new Role(1, "Test1"));
        roles.add(new Role(2, "Test2"));

        Employee employee = Employee.builder()
                .name("Sourabh Sarkar")
                .position("Chief Technology Officer (CTO)")
                .office("Mumbai")
                .age(31)
                .startDate(LocalDate.of(2015,3,23))
                .salary(1200000.00)
                .roles(roles)
                .build();

        Employee returnedEmployee = employeeRepository.save(employee);
        assertEquals(employee.getEmployeeId(), returnedEmployee.getEmployeeId());
    }
}