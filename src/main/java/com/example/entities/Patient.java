package com.example.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Patient implements Serializable {
	@Id
   	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nomPatient;
	private String prenPatient;
	private Date dateNaissance;
	private String groupeSgn;
	private String sexe;
	private String addresse;
	private Long ville;
	private Date dateCreaDoc;
	
	@OneToMany(mappedBy="patient")
	private Collection<Ordonnance> ordonnances;
	@OneToMany(mappedBy="patient")
	private Collection<Visite> visites;
	
	public Collection<Ordonnance> getOrdonnances() {
		return ordonnances;
	}
	public void setOrdonnances(Collection<Ordonnance> ordonnances) {
		this.ordonnances = ordonnances;
	}
	public Collection<Visite> getVisites() {
		return visites;
	}
	public void setVisites(Collection<Visite> visites) {
		this.visites = visites;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Long id, String nomPatient, String prenPatient) {
		super();
		this.id = id;
		this.nomPatient = nomPatient;
		this.prenPatient = prenPatient;
	}
	public Patient(String nomPatient, String prenPatient) {
		super();
		this.nomPatient = nomPatient;
		this.prenPatient = prenPatient;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomPatient() {
		return nomPatient;
	}
	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}
	public String getPrenPatient() {
		return prenPatient;
	}
	public void setPrenPatient(String prenPatient) {
		this.prenPatient = prenPatient;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getGroupeSgn() {
		return groupeSgn;
	}
	public void setGroupeSgn(String groupeSgn) {
		this.groupeSgn = groupeSgn;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public Long getVille() {
		return ville;
	}
	public void setVille(Long ville) {
		this.ville = ville;
	}
	public Date getDateCreaDoc() {
		return dateCreaDoc;
	}
	public void setDateCreaDoc(Date dateCreaDoc) {
		this.dateCreaDoc = dateCreaDoc;
	}
	
	
}
