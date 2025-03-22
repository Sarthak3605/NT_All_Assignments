package com.HRPortal.HRPortal.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "hr") //connected to hr table
@Entity
public class HR {
    @Id //it stated id is a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //built-in auto increment
    private Long id;
    @Column(nullable = false,unique = true) //column annotation to define column which should be unique and not null
    private String email;
    @Column(nullable = false)
    private String password;
}
