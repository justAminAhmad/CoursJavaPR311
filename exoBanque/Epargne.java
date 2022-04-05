package com.supinfo.java.exoBanque;

import java.time.LocalDate;

public class Epargne extends Compte{
	private int interet;
	
	public Epargne() {
		super();
	}
	
	public Epargne(long numeroCompte, String prenomClient, 
			String nomClient, int solde, 
			String agence, LocalDate dateOuverture, int interet) 
	{
		super(numeroCompte, prenomClient, nomClient, solde, agence, dateOuverture);
		this.interet = interet;
	}

	public int getInteret() {
		return interet;
	}

	public void setInteret(int interet) {
		this.interet = interet;
	}

	@Override
	public String toString() {
		return super.toString() + ", interet=" + interet + "]";
	}

	@Override
	public String getInfoClient() {
		return "Client proprietaire du compte : " + super.getPrenomClient() + " " + super.getNomClient();
	}
	
	
}
