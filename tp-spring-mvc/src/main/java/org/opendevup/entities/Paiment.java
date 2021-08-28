package org.opendevup.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity 
public class Paiment {
	
	@Id
	@GeneratedValue
	private long id ;
	private String nom;
	private int Montant ;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_debut;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_fin;
	
		public Paiment() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Paiment(String nom, int montant, Date date_debut, Date date_fin) {
		super();
		this.nom = nom;
		Montant = montant;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
		public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getMontant() {
		return Montant;
	}
	public void setMontant(int montant) {
		Montant = montant;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
		
		

}
