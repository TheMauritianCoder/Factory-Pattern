package com.themauritiancoder.design.pattern.factory.domain;

public class TeamLeader extends Employee{
	
	public TeamLeader(EmployeeType teamLeader, Double basicSalary) {
		super.employeeType = employeeType;
		super.basicSalary = basicSalary;
	}

	@Override
	public double getTransportAllowance() {
		return basicSalary * 0.075;
	}

}