package com.HRPortal.HRPortal.repository;

import com.HRPortal.HRPortal.model.HR;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HRRepository extends JpaRepository<HR, Long> { //here it takes hr model or entity and id is the long
    Optional<HR> findByEmailAndPassword(String email, String password);
}
