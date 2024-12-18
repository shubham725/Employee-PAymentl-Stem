package com.employeproject.file;

import java.util.ArrayList;

public class PayRollSystem {
	
	
	private ArrayList <Employee> employeeList;
	
	
	public PayRollSystem(){ 
		employeeList = new ArrayList<>();
	}
	
	
	//----- Add Employee-----------------
	

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
//-------------Display Employee----------------
	
	public void displayEmployee() {
		for(Employee employee :employeeList) {
			employee.display();
			if(employeeList==null) {
				System.out.println("No employee");
			}
			
			
		}
	}
	
	
	//-----------Remove Employee---------
	
	
	public void removeEmployee(int id) {
		Employee employeeToRemove =null;
		
		for(Employee employee : employeeList) {
			if(employee.getempId()==id) {
				employeeToRemove =employee;
				break;
			}
		}
		
		if(employeeToRemove !=null) {
			employeeList.remove(employeeToRemove);
			System.out.println("Employee Remove Successfully");
		}else { 
			System.out.println("Inavalid Employee");
		}
	}
	
	///search Employee -------------------------------------
	
	
	public Employee serchEmployee(int id) {
		Employee employeeToSearch =null;
		
		for(Employee employee : employeeList) {
			if(employee.getempId()==id) {
				employeeToSearch = employee; ;
				break;
			}
		}
		
		if(employeeToSearch !=null) {
			employeeToSearch.display();
		}else {
			System.out.println("Employee Not Found");
		}
		return employeeToSearch;
	}
	


//------------updateEmployeee-----------------


public Employee updateSalaryEmployee(int id , String name) {
	Employee employeeToUpdate =null;
	for(Employee employee : employeeList) {
		if(employee.getempId()==id) {
			employee.setempName(name);
			employeeToUpdate = employee;
			break;
		}
	}
	if(employeeToUpdate !=null) {
		System.out.println("Succesufully Update Name");
	}else {
		System.out.println("invalid employee");
	}
	return employeeToUpdate;
	
}
}

