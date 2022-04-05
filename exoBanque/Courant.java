package com.supinfo.java.exoBanque;

import java.time.LocalDate;

public class Courant extends Compte {
	private int decouvert;
	
	public Courant() {
		super();
	}
	
	public Courant(long numeroCompte,String prenomClient, 
			String nomClient, int solde, 
			String agence, LocalDate dateOuverture, int decouvert)
	{
		super(numeroCompte, prenomClient, nomClient, solde, agence, dateOuverture);
		this.decouvert = decouvert;
	}
	
	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	
	@Override
	public String toString() {
		return super.toString() + ", decouvert=" + decouvert + "]";
	}

	@Override
	public String getInfoClient() {
		return "Client proprietaire du compte : " + super.getPrenomClient() + " " + super.getNomClient();
	}
	
}
