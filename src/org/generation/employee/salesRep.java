package org.generation.employee;

public class salesRep extends Employee {
	private double salesMade;

	public salesRep(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationsDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationsDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}//constructor

	
	///////////////Getters & Setters/////////////////////
	public double getSalesMade() {
		return salesMade;
	}//getSalesMade
	
	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}//setSalesMade
	
	/////////////////////Methods/////////////////////////////
	
	public double calculateComission() {
        return 0.1 * salesMade;
    }


	///////////////////toString/////////////////////////////
	@Override
	public String toString() {
		return "salesRep [salesMade=" + salesMade + ", getSalesMade()=" + getSalesMade() + "]";
	}
	
	
	

}
