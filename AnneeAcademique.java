package com.supinfo.java.chap2;

public class AnneeAcademique {
	private long id;
	private String libele;
	private String description;
	private static int compteur = 0;
	
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

	@Override
	public String toString() {
		return "AnneeAcademique [id=" + id + ", libele=" + libele + ", description=" + description + "]";
	}

}
