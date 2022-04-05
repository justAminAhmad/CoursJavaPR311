package com.supinfo.java.chap2;

import java.time.LocalDate;

public class Inscription {
	private long id;
	private LocalDate date;
	private static int compteur = 0;
	private Niveau niveau;
	private AnneeAcademique anneeAcademique;
	
	public Inscription() 
	{
		Inscription.compteur++;
		this.id = compteur;
	}

	public Inscription(LocalDate date)
	{
		this();
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public AnneeAcademique getAnneeAcademique() {
		return anneeAcademique;
	}

	public void setAnneeAcademique(AnneeAcademique anneeAcademique) {
		this.anneeAcademique = anneeAcademique;
	}

	@Override
	public String toString() {
		return "Inscription [id=" + id + ", date=" + date + "]";
	}
	
}
