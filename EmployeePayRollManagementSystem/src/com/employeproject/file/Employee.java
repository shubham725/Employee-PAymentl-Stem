package com.employeproject.file;
///abstract class 
public abstract class Employee {
	private int empId ;
	private String empName;
	
	
	public Employee() {
		this.empId = 0;
		this.empName="UnDefine";
	}
	
	Employee(int id , String name){
		this.empId=id;
		this.empName=name;
	}
	
	public void setempId(int id) {
		this.empId=id;
	}
	
	
	public int getempId() {
		return empId;
	}
	
	public void setempName(String name) {
		this.empName=name;
	}
	
	public String getempName() {
		return empName;
	}
	
	
	public abstract double  calculateSalary();
	
	public abstract void display();

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	
	
	
	
	
	

}
