package com.themauritiancoder.design.pattern.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.themauritiancoder.design.pattern.factory.domain.Employee;
import com.themauritiancoder.design.pattern.factory.domain.EmployeeFactory;
import com.themauritiancoder.design.pattern.factory.domain.EmployeeType;

@SpringBootApplication
public class FactoryMethodPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryMethodPatternApplication.class, args);
	
		// Initialize the factory
		EmployeeFactory factory = new EmployeeFactory();
		
		// Here we let the factory initialise the sub classes for us with.
		Employee manager = factory.getEmployee(EmployeeType.MANAGER);
		Employee teamlLeader = factory.getEmployee(EmployeeType.TEAM_LEADER);
		Employee seniorDev = factory.getEmployee(EmployeeType.SENIOR_DEVELOPER);
		Employee juniorDev = factory.getEmployee(EmployeeType.JUNIOR_DEVELOPER);
		
		// When we output the employee details we see that though they are employee, their sub class properties are taken into account. 
		System.out.println("Manager has a basic salary of Rs. "+manager.getBasicSalary()+" + a transport allowance of "+manager.getTransportAllowance());
		System.out.println("TeamLeader has a basic salary of Rs. "+teamlLeader.getBasicSalary()+" + a transport allowance of "+teamlLeader.getTransportAllowance());
		System.out.println("Senior Dev has a basic salary of Rs. "+seniorDev.getBasicSalary()+" + a transport allowance of "+seniorDev.getTransportAllowance());
		System.out.println("Junior Dev has a basic salary of Rs. "+juniorDev.getBasicSalary()+" + a transport allowance of "+juniorDev.getTransportAllowance());
	}

}
