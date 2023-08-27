package com.sarkar.ems.repositories;

import com.sarkar.ems.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.id = ?1")
    Employee findByEmployeeId(Long id);

    List<Employee> findByNameContaining(String name);

}
