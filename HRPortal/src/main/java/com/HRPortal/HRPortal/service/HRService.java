package com.HRPortal.HRPortal.service;

import com.HRPortal.HRPortal.model.HR;
import com.HRPortal.HRPortal.repository.HRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HRService {

    @Autowired
    private HRRepository hrRepository;

    public boolean authenticateHr(String email, String password) { //this authenticates the hr and search for it by email and password
        Optional<HR> optionalHR = hrRepository.findByEmailAndPassword(email, password);
        return optionalHR.isPresent();
    }
}
