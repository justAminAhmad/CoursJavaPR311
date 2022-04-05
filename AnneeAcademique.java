package com.supinfo.java.chap2;

import java.util.List;

public class AnneeAcademique {
	private long id;
	private String libele;
	private String description;
	private static int compteur = 0;
	private List<Inscription> inscription;
	
	public AnneeAcademique()
	{
		AnneeAcademique.compteur++;
		this.id = compteur;		
	}
	
	public AnneeAcademique(String libele, String description)
	{
		this();
		this.libele = libele;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Inscription> getInscription() {
		return inscription;
	}

	public void setInscription(List<Inscription> inscription) {
		this.inscription = inscription;
	}

	@Override
	public String toString() {
		return "AnneeAcademique [id=" + id + ", libele=" + libele + ", description=" + description + "]";
	}

}
