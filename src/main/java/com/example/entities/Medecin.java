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
public class Medecin implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nomMedecin;
	private String prenMedecin;
	private String telMedecin;
	private String specialite;
	
	@OneToMany(mappedBy="medecin")
	private Collection<Ordonnance> ordonnances;
	@OneToMany(mappedBy="medecin")
	private Collection<Visite> visites;
	
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medecin(Long id, String nomMedecin, String prenMedecin) {
		super();
		this.id = id;
		this.nomMedecin = nomMedecin;
		this.prenMedecin = prenMedecin;
	}

	public Medecin(String nomMedecin, String prenMedecin) {
		super();
		this.nomMedecin = nomMedecin;
		this.prenMedecin = prenMedecin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomMedecin() {
		return nomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}

	public String getPrenMedecin() {
		return prenMedecin;
	}

	public void setPrenMedecin(String prenMedecin) {
		this.prenMedecin = prenMedecin;
	}

	public String getTelMedecin() {
		return telMedecin;
	}

	public void setTelMedecin(String telMedecin) {
		this.telMedecin = telMedecin;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

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
	
	
	

}
