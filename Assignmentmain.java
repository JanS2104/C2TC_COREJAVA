package com.janani.assignments.utility;

import com.janani.assignments.employee.Manager;
import com.janani.assignments.employee.Developer;



public class Assignmentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
			manager.setName("Janani");
			manager.setEmployeeId(21);
			manager.setSalary(65031);
			manager.setDepartment("HR");
			
			
		Developer developer = new Developer();
			developer.setName("Janani");
			developer.setEmployeeId(21);
			developer.setSalary(65031);
			developer.setProlang("HR");
			
			System.out.println("Manager Details:");
			EmployeeUtility.printManagerDetails(manager);
			
			System.out.println("Developer Details");
			EmployeeUtility.printDeveloperDetails(developer);;
	
	}

}
