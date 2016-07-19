package com.example.entities;

import java.io.Serializable;
import java.util.Date;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Ordonnance implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	
	private Date dateOrd;
	
	private String medicament;
	
	@ManyToOne
	private Patient patient;
	
	@ManyToOne
	private Medecin medecin;
	
	public Ordonnance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ordonnance(Patient patient, Medecin medecin) {
		super();
		this.patient = patient;
		this.medecin = medecin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateOrd() {
		return dateOrd;
	}

	public void setDateOrd(Date dateOrd) {
		this.dateOrd = dateOrd;
	}

	public String getMedicament() {
		return medicament;
	}

	public void setMedicament(String medicament) {
		this.medicament = medicament;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	
}
