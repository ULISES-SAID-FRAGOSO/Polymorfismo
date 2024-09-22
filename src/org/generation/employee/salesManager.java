package org.generation.employee;

import java.util.HashMap;
import java.util.Map;

public class salesManager extends Employee{
	private HashMap<Integer, salesRep> salesTeam;

	public salesManager(String firstName, String lastName, int registration, int age, int daysWorked,
		int vacationsDaysTaken, double salary, int yearsWorked) {
		super(firstName, lastName, registration, age, daysWorked, vacationsDaysTaken, salary, yearsWorked);
		this.salesTeam = new HashMap<>();
	}//constructor
	
	
	///////////////////Methods////////////////////////////////////
	//----Añadir las ventas del salesRep al salesTeam
	public void addSalesRep (int registration, salesRep salesRep) {
		salesTeam.put(registration, salesRep);
	}//addSalesRep
	
	//----Generar la comision del salesManager basado en las ventas del salesTeam
	public double calculateComission() {
		double totalSales = 0.0;
		
		for(Map.Entry<Integer, salesRep> entry: salesTeam.entrySet()) {
			totalSales += entry.getValue().getSalesMade();		
		}
		
		return 0.03 * totalSales;
	
	}
	
	
	

}
