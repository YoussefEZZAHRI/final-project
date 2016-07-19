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
public class Rdv implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date dateRdv;
	@ManyToOne
	private Patient patient;
	public Rdv() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rdv(Long id, Date dateRdv, Patient patient) {
		super();
		this.id = id;
		this.dateRdv = dateRdv;
		
		this.patient = patient;
	}
	public Rdv(Date dateRdv, Patient patient) {
		super();
		this.dateRdv = dateRdv;
		this.patient = patient;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateRdv() {
		return dateRdv;
	}
	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Rdv(Patient patient) {
		super();
		this.patient = patient;
	}
	
	
}
