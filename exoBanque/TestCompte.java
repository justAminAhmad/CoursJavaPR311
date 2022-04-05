package com.supinfo.java.exoBanque;

import java.time.LocalDate;

public class TestCompte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate dateCreation1 = LocalDate.parse("2021-09-11");
		LocalDate dateCreation2 = LocalDate.parse("2012-10-18");
		
		Epargne epargne1 = new Epargne(1, "Mamadou", "Sarr", 1000000, "Pompdou", dateCreation1, 12000);
		Epargne epargne2 = new Epargne(2, "Adboulaye", "Diallo", 1252000, "Point E", dateCreation2, 48200);
		
		System.out.println(epargne1);
		System.out.println(epargne2);
	}

}
