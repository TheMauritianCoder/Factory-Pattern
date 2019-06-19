package com.themauritiancoder.design.pattern.factory.domain;

public class Manager extends Employee{
	
	public Manager(EmployeeType employeeType, Double basicSalary) {
		super.employeeType = employeeType;
		super.basicSalary = basicSalary;
	}

	@Override
	public double getTransportAllowance() {
		return basicSalary * 0.1;
	}

}
