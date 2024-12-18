package com.employeproject.file;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		PayRollSystem payRoll= new PayRollSystem(); 
	      
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			
			System.out.println("--- Employee Pays-Roll Management System ---");
			System.out.println("_________________________");
			System.out.println("| No | Manu             |");
			System.out.println("|-----------------------|");
			System.out.println("| 1  | Add Employee     |");
			System.out.println("| 2  | Display Employee |");
			System.out.println("| 3  | Remove Employee  |");
			System.out.println("| 4  | Search Employee  |");
			System.out.println("| 5  | update Employee  |");
			System.out.println("| 6  | Exist            |");
			System.out.println("|----|------------------|");
			System.out.println("Enter the choice No");
			
			choice = sc.nextInt();
			
			
			switch (choice ) {
			
			case 1 :
				
				int num ;
				do {
					System.out.println("1 Add Full Time Employee");
					System.out.println("2 Add For Part Time Employee");
					System.out.println("Enter No ");
					
					num = sc.nextInt();
					
					switch(num){
					case 1:
						int id; String  name ; int salary;
						System.out.println("Enter Employee Id");
						id = sc.nextInt();
						 sc.nextLine();
						System.out.println("Enter Employee Name");
						name =sc.nextLine();
						System.out.println("Enter Montly Salary");
						salary =sc.nextInt();
						FullTimeEmployee e1 = new FullTimeEmployee(id , name, salary);
						payRoll.addEmployee(e1);
						 
						break;
						
					case 2:	
						int pid; String  pname ; int hoursWork; double hourRate;
						System.out.println("Enter Employee Id");
						pid = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Employee Name");
						pname =sc.nextLine();
						System.out.println("Enter Montly Hours Work");
						hoursWork =sc.nextInt();
						System.out.println("Enter Montly Hour Rate");
						hourRate =sc.nextDouble();
						PartTimeEmployee p1 = new PartTimeEmployee(pid , pname, hoursWork ,hourRate);
						payRoll.addEmployee(p1);
						 break;
					}
					
					  break;
					
				}while(num != 2);
			 
				
				break;
				
			case 2:
				
				payRoll.displayEmployee();
				break;
				
			case 3: 
				int eid;
				
				System.out.println("Enter Id to remove Employee");
				eid =sc.nextInt();
				payRoll.removeEmployee(eid);
				
				break;
			
				
			case 4:
				System.out.println("Enter Id to Search Employee");
				eid =sc.nextInt();
				payRoll.serchEmployee(eid);
				
				break;
				
			case 5:
				String name;
				System.out.println("Enter Id to Search Employee");
				eid =sc.nextInt();
				sc.nextLine();
				System.out.println("Entert to update Name");
				name =sc.nextLine();
				payRoll.updateSalaryEmployee(eid ,name);
				
				
			}
			
		
			
			
		}while(choice !=7);
		
		sc.close();
		
		

	}

}
