package com.themauritiancoder.design.pattern.factory.domain;

public class SeniorDeveloper extends Employee{

	public SeniorDeveloper(EmployeeType seniorDeveloper, Double basicSalary) {
		super.employeeType = employeeType;
		super.basicSalary = basicSalary;
	}

	@Override
	public double getTransportAllowance() {
		return basicSalary * 0.05;
	}

}
