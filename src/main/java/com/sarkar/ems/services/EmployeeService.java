package com.sarkar.ems.services;

import com.sarkar.ems.models.postgres.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAllEmployees();

    Page<Employee> findFirstTenEmployees();

    Employee findByEmployeeId(Long id);

    List<Employee> findByNameContaining(String name);

    Employee save(Employee employee);

    void deleteById(long id);

    void deleteAll();

    void delete(Employee employee);
}
