package com.HRPortal.HRPortal.model;

import jakarta.persistence.*;
import lombok.Data;

@Data //this is imported lambok so that no need for getters setters part
@Entity
@Table(name = "employees") //connected to that table name employees
public class Employee {
    @Id //it defines the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    private String email;
    private Double salary;

}
