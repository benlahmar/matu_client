package com.example.demo;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

	String rue,ville,payes,codep;

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPayes() {
		return payes;
	}

	public void setPayes(String payes) {
		this.payes = payes;
	}

	public String getCodep() {
		return codep;
	}

	public void setCodep(String codep) {
		this.codep = codep;
	}

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adresse(String rue, String ville, String payes, String codep) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.payes = payes;
		this.codep = codep;
	}
	
	
}
