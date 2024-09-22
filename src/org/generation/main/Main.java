package org.generation.main;

import org.generation.employee.salesManager;
import org.generation.employee.salesRep;

public class Main {
	public static void main(String[] args) {
		salesRep salesRep1 = new salesRep("Ulises", "Fragoso", 100, 24, 360, 12, 4000, 1, 300);
		salesManager salesManager1 = new salesManager ("Luis", "Pedraza", 200, 33, 720, 24, 6000, 2);
		salesManager1.addSalesRep(101, salesRep1);
		System.out.println(salesRep1);
		System.out.println(salesManager1);
		System.out.println("salesRep1 comission: " + salesRep1.calculateComission());
		System.out.println("salesManager1 comission: " + salesManager1.calculateComission());
		
	}//main

}//class main
