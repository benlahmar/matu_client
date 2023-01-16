package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
@NamedQuery(name = "abc",query = "select c from Client c where c.nom=?1 and c.adresse.ville=?2")
public class Client {

	@Id
	@GeneratedValue
	long id;
	@Column(nullable = false, name = "username")
	String nom;
	
	@ElementCollection
	@OrderColumn
	String[] prenoms;
	
	@Embedded
	Adresse adress;
	
	LocalDate date;
	
	
	
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
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String[] getPrenoms() {
		return prenoms;
	}
	public void setPrenoms(String[] prenoms) {
		this.prenoms = prenoms;
	}
	public Adresse getAdress() {
		return adress;
	}
	public void setAdress(Adresse adress) {
		this.adress = adress;
	}
	
	
}
