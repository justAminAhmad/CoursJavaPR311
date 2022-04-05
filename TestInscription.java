package com.supinfo.java.chap2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestInscription {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.parse("2022-01-01");
		LocalDate date2 = LocalDate.parse("2022-01-18");
		LocalDate date3 = LocalDate.parse("2022-02-07");
		LocalDate date4 = LocalDate.parse("2022-02-20");
		LocalDate date5 = LocalDate.parse("2022-02-28");
		
		Niveau niveau1 = new Niveau("Licence");
		AnneeAcademique annee1 = new AnneeAcademique("2022-2023", "Annee Sans COVID");
		
		Inscription inscription1 = new Inscription(date1);
		Inscription inscription2 = new Inscription(date2);
		Inscription inscription3 = new Inscription(date3);
		Inscription inscription4 = new Inscription(date4);
		Inscription inscription5 = new Inscription(date5);
		
		inscription1.setAnneeAcademique(annee1);
		inscription2.setNiveau(niveau1);
		inscription3.setNiveau(niveau1);
		inscription4.setAnneeAcademique(annee1);
		inscription5.setAnneeAcademique(annee1);
		inscription5.setNiveau(niveau1);
		
		List<Inscription>listInscription = new ArrayList<>();
		listInscription.add(inscription1);
		listInscription.add(inscription4);
		listInscription.add(inscription5);
		annee1.setInscription(listInscription);

		List<Inscription>listInscription2 = new ArrayList<>();
		listInscription2.add(inscription2);
		listInscription2.add(inscription3);
		listInscription2.add(inscription5);
		niveau1.setInscription(listInscription2);
		
		System.out.println(niveau1);
		System.out.println(" ");
		for(Inscription inscription : niveau1.getInscription()) 
		{
			
			System.out.println(inscription);
			System.out.println(" ");
		}
		
		System.out.println(annee1);
		System.out.println(" ");
		for(Inscription inscription : annee1.getInscription()) 
		{
			
			System.out.println(inscription);
			System.out.println(" ");
		}
	}

}
