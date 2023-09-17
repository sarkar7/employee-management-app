package com.sarkar.ems.repositories.postgres;

import com.sarkar.ems.models.postgres.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.employeeId = ?1")
    Employee findByEmployeeId(Long id);

    List<Employee> findByNameContaining(String name);

}
