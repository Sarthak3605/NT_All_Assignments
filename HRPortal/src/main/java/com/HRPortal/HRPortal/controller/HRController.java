package com.HRPortal.HRPortal.controller;

import com.HRPortal.HRPortal.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/hr") //at endpoint /api/hr
public class HRController {

    @Autowired
    private HRService HRService;

    @PostMapping("/login")
    public boolean login(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");
        return HRService.authenticateHr(email, password); //this will go to HR service to authenticates the hr using email and password
    }
}
