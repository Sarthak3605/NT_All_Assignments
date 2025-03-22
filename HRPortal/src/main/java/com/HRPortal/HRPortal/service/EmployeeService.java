package com.HRPortal.HRPortal.service;

import com.HRPortal.HRPortal.model.Employee;
import com.HRPortal.HRPortal.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired //injection to use EmployeeRepository in service file we don't need to manually create by using new keyword
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll(); //this gives list of all the employees
    }

    @Transactional //so that transaction will be commited properly
    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Transactional
    public Employee updateEmployee(Long id, Employee newEmployee) {
        return repository.findById(id).map(employee -> {
            employee.setName(newEmployee.getName());
            employee.setDepartment(newEmployee.getDepartment());
            employee.setEmail(newEmployee.getEmail());
            employee.setSalary(newEmployee.getSalary());
            return repository.save(employee); //this set the info and save it
        }).orElseThrow(()-> new RuntimeException("Error!"));
    }

    @Transactional
    public void deleteEmployee(Long id) {
        repository.deleteById(id);

        if (repository.count() == 0) {
            repository.resetEmployeeId();
        }
    }
}
