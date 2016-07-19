package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Visite implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private Date dateVisite;
	
	private Long tarif;
	
	@ManyToOne
	@JoinColumn(name="patient_id",referencedColumnName="id")
	private Patient patient;
	
	@ManyToOne
	@JoinColumn(name="medecin_id",referencedColumnName="id")
	private Medecin medecin;
	
	public Visite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Visite(Patient patient, Medecin medecin) {
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

	public Date getDateVisite() {
		return dateVisite;
	}

	public void setDateVisite(Date dateVisite) {
		this.dateVisite = dateVisite;
	}

	public Long getTarif() {
		return tarif;
	}

	public void setTarif(Long tarif) {
		this.tarif = tarif;
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
