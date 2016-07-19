package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.IPatientRepository;
import com.example.entities.Patient;

@RequestMapping("/patient")
@RestController
public class PatientController {
	@Autowired
	private IPatientRepository patientRepository;

	@RequestMapping("/test")
	public String test(){

		return "test" ;
	}
	@RequestMapping("/save")
	public String savePatient(Patient patient){
		patientRepository.save(patient);
		return patient.toString();
	}

	@RequestMapping("/allPatients")
	public String getPatients(){
		List<Patient> list=	patientRepository.findAll();
		return list.toString();
	}

	@RequestMapping("all")
	public List<Patient> getAll(){
		return patientRepository.findAll();
	}

	@RequestMapping("/get")
	public Patient get(Long ref){
		return patientRepository.getOne(ref);
	}

	@RequestMapping("/delete")
	public boolean delete(Long ref){
		patientRepository.delete(ref);
		return true;
	}

	@RequestMapping("update")
	public Patient update(Patient p){

		patientRepository.saveAndFlush(p);
		return p;
	}

}

