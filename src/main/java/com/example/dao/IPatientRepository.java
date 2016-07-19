package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Patient;

public interface IPatientRepository  extends JpaRepository<Patient, Long>{

}
