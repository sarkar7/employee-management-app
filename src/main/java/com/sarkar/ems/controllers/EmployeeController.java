package com.sarkar.ems.controllers;

import com.sarkar.ems.constants.UriConstants;
import com.sarkar.ems.models.postgres.Employee;
import com.sarkar.ems.services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(UriConstants.API_VERSION_1)
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //Getting all the records
    @GetMapping(UriConstants.ALL_EMPLOYEES)
    public ResponseEntity<List<Employee>> getAllEmployees() {
        try {
            List<Employee> employees = new ArrayList<>(employeeService.findAllEmployees());
            return !employees.isEmpty() ? new ResponseEntity<>(employees, HttpStatus.OK)
                    : new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            log.info("Couldn't return anything as " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //Getting few records
    @RequestMapping(UriConstants.FEW_EMPLOYEES)
    public List<Employee> getFirstTenEmployees() {
        return employeeService.findFirstTenEmployees().toList();
    }

    //Getting single record
    @RequestMapping(UriConstants.SINGLE_EMPLOYEE)
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id) {
        log.debug("Getting Single Employee with ID - " + id);
        Optional<Employee> employeeData = Optional.ofNullable(employeeService.findByEmployeeId(id));
        return employeeData.map(
                employee -> new ResponseEntity<>(employee, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //Creating new record
    @PostMapping(UriConstants.CREATE_NEW_EMPLOYEES)
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        try {
            employeeService.save(employee);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            log.info("Couldn't create anything as " + e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Updating an existing record
    @PutMapping(UriConstants.SINGLE_EMPLOYEE)
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
        Optional<Employee> employeeData = Optional.ofNullable(employeeService.findByEmployeeId(id));

        if (employeeData.isPresent()) {
            Employee _employee = employeeData.get();
            _employee.setName(employee.getName());
            _employee.setPosition(employee.getPosition());
            _employee.setAge(employee.getAge());
            _employee.setOffice(employee.getOffice());
            _employee.setStartDate(employee.getStartDate());
            _employee.setSalary(employee.getSalary());
            return new ResponseEntity<>(employeeService.save(_employee), HttpStatus.OK);
        } else {
            log.info("Couldn't find the record in database with ID - " + employee.getEmployeeId());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //Deleting an existing record
    @DeleteMapping(UriConstants.SINGLE_EMPLOYEE)
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable("id") long id) {
        Optional<Employee> rec = Optional.ofNullable(employeeService.findByEmployeeId(id));
        try {
            employeeService.delete(rec.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            log.info("Bad request as " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //Deleting all the records
    @DeleteMapping(UriConstants.ALL_EMPLOYEES)
    public ResponseEntity<HttpStatus> deleteAllEmployees() {
        try {
            employeeService.deleteAll();
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            log.info("Bad request as " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
