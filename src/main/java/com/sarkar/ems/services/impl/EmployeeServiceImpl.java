package com.sarkar.ems.services.impl;

import com.sarkar.ems.models.postgres.Employee;
import com.sarkar.ems.repositories.postgres.EmployeeRepository;
import com.sarkar.ems.services.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Page<Employee> findFirstTenEmployees() {
        return employeeRepository.findAll(PageRequest.of(0, 10, Sort.by(Sort.Direction.ASC, "id")));
    }

    public Employee findByEmployeeId(Long id) {
        return employeeRepository.findByEmployeeId(id);
    }

    public Employee findByUsername(String username) {
        return employeeRepository.findByUsername(username);
    }

    public List<Employee> findByNameContaining(String name) {
        return employeeRepository.findByNameContaining(name);
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteById(long id) {
        employeeRepository.deleteById(id);
    }

    public void deleteAll() {
        employeeRepository.deleteAll();
    }

    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

}
