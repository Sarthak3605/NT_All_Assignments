package com.HRPortal.HRPortal.repository;

import com.HRPortal.HRPortal.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long> { //employee is the entity and long is for id
    @Modifying
    @Transactional
    @Query(value = "ALTER SEQUENCE employees_id_seq RESTART WITH 1", nativeQuery = true)
    void resetEmployeeId(); //here we use to reset the id of employee by using query otherwise id will be displayed wrong in table
}