package com.employeproject.file;

public class PartTimeEmployee extends Employee{
	
	private int hoursWorked;
	private double hourlyRate;
	

	public PartTimeEmployee(int id, String name , int hoursWorked, double hourlyRate) {
		super(id, name);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;

		
	}

	public int getHoursWorked() {
		return hoursWorked;
	}



	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


	@Override
	public String toString() {
		return "PartTimeEmployee [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + "]";
	}



	@Override
	public double calculateSalary() {
		
	 return	getHoursWorked() * getHourlyRate();
		
	}

	@Override
	public void display() {
		System.out.println("Employee ID: " + getempId());
        System.out.println("Employee Name: " +getempName());
        System.out.println("Employee Salary: " +hoursWorked);
        System.out.println("Employee Salary: " +hourlyRate);
        System.out.println("-----------------------------");
		
	}

	
}
