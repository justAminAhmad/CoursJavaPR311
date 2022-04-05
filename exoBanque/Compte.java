package com.supinfo.java.exoBanque;

import java.time.LocalDate;

public abstract class Compte {
	private long numeroCompte;
	private String prenomClient;
	private String nomClient;
	private int solde;
	private String agence;
	private LocalDate dateOuverture;
	
	public Compte() {}

	public Compte(long numeroCompte, String prenomClient,
			String nomClient,  int solde, 
			String agence, LocalDate dateOuverture) {
		super();
		this.numeroCompte = numeroCompte;
		this.prenomClient = prenomClient;
		this.nomClient = nomClient;
		this.solde = solde;
		this.agence = agence;
		this.dateOuverture = dateOuverture;
	}

	public long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getNomClient() {
		return nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public String getAgence() {
		return agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}

	public LocalDate getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public abstract String getInfoClient();
	
	@Override
	public String toString() {
		return "[numeroCompte=" + numeroCompte + ", prenomClient=" + prenomClient + ", nomClient=" + nomClient 
				+ ", solde=" + solde + ", agence=" + agence + ", dateOuverture=" + dateOuverture;
	}

}
