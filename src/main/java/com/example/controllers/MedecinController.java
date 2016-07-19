package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.IMedecinRepository;
import com.example.entities.Medecin;
@RequestMapping(value="/medecins")
@RestController
public class MedecinController {


	@Autowired
	private IMedecinRepository medecinRepository;
	
	@RequestMapping("/save")
	public boolean CreateMadecin(Medecin m){
		medecinRepository.save(m);
		return true;
	}
	@RequestMapping("/getall")
	public List<Medecin> getAllMedecin(){

		return medecinRepository.findAll();
	}

	@RequestMapping("/get")
	public Medecin getMedecin(Long ref){
		return medecinRepository.findOne(ref);
	}

	@RequestMapping("/delete")
	public boolean deleteMedecin(Long ref) {

		medecinRepository.delete(ref);
		return medecinRepository.exists(ref);
	}
	@RequestMapping("/update")
	public boolean updateMedecin(Medecin m){
		medecinRepository.saveAndFlush(m);
		return true;
	}





}

