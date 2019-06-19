package com.themauritiancoder.design.pattern.factory.domain;

public class JuniorDeveloper extends Employee{
	
	public JuniorDeveloper(EmployeeType juniorDeveloper, Double basicSalary) {
		super.employeeType = employeeType;
		super.basicSalary = basicSalary;
	}

	@Override
	public double getTransportAllowance() {
		return basicSalary * 0.05;
	}

}