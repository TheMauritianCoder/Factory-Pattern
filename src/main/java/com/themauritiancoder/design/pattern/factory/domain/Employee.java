package com.themauritiancoder.design.pattern.factory.domain;

public abstract class Employee {

	protected EmployeeType employeeType;
	protected Double basicSalary;

	public Employee() {}

	public Employee(EmployeeType employeeType, Double basicSalary) {
		this.employeeType = employeeType;
		this.basicSalary = basicSalary;
	}

	public abstract double getTransportAllowance();
	
	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public Double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}

}
