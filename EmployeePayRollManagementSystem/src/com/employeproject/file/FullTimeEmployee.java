package com.employeproject.file;

public class FullTimeEmployee extends Employee{

	private int monthlySalary;
	
	public FullTimeEmployee(int id, String name ,int monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}


	public int getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}


	
  

	@Override
	public String toString() {
		return "FullTimeEmployee [monthlySalary=" + monthlySalary + "]";
	}


	public double calculateSalary() {
		// TODO Auto-generated method stub
		return getMonthlySalary();
	}


	@Override
	public void display() {
		System.out.println("Employee ID: " + getempId());
        System.out.println("Employee Name: " +getempName());
        System.out.println("Employee Salary: " +monthlySalary);
        
        System.out.println("-----------------------------");
		
	}

}
