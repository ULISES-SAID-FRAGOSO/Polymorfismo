package org.generation.employee;

public class Employee {
	private String firstName;
	private String lastName;
	private int registration;
	private int age;
	private int daysWorked;
	private int vacationsDaysTaken;
	private double salary;
	private int yearsWorked;
	
	public Employee(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationsDaysTaken, double salary, int yearsWorked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationsDaysTaken = vacationsDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}

	
	//////////////////////Getters and Setters////////////////////////////////////////
	
	public String getFirstName() {
		return firstName;
	}//getFirstName

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}//setFirstName

	public String getLastName() {
		return lastName;
	}//getLastName

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}//setLastName

	public int getRegistration() {
		return registration;
	}//getRegistration

	public void setRegistration(int registration) {
		this.registration = registration;
	}//setRegistration

	public int getAge() {
		return age;
	}//getAge

	public void setAge(int age) {
		this.age = age;
	}//setAge

	public int getDaysWorked() {
		return daysWorked;
	}//getDaysWorked

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}//setDaysWorked

	public int getVacationsDaysTaken() {
		return vacationsDaysTaken;
	}//getVacationsDaysTaken

	public void setVacationsDaysTaken(int vacationsDaysTaken) {
		this.vacationsDaysTaken = vacationsDaysTaken;
	}//setVacationsDaysTaken

	public double getSalary() {
		return salary;
	}//getSalary

	public void setSalary(double salary) {
		this.salary = salary;
	}//setSalary

	public int getYearsWorked() {
		return yearsWorked;
	}//getYearsWorked

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}//setYearsWorked
	
	/////////////////Methods///////////////////////////
	
	public int timeToRetirement() {
		return Math.min(60 - age, 40 - yearsWorked);
	}//timeToRetirement
	
	public int vacationTimeLeft(){
	    return (daysWorked / 360) * (30 - vacationsDaysTaken);
	}//vacationTimeLeft

	public double calculateBonus(){
	    return 2.2*salary;
	}//calculateBonus
	
	////////////////////toString///////////////////////////////////
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationsDaysTaken=" + vacationsDaysTaken
				+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
	}
	
	
}//class employee
