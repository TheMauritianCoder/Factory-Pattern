package com.themauritiancoder.design.pattern.factory.domain;

/**
 * 
 * The Factory is responsible for initialising the sub classes for us.
 * 
 * @author Ravi 
 *
 */
public class EmployeeFactory {

	public Employee getEmployee(EmployeeType employeeType) {
		if(employeeType.equals(EmployeeType.MANAGER)) {
			return new Manager(EmployeeType.MANAGER, 80000.00);
		}

		if(employeeType.equals(EmployeeType.TEAM_LEADER)) {
			return new TeamLeader(EmployeeType.TEAM_LEADER, 60000.00);
		}

		if(employeeType.equals(EmployeeType.SENIOR_DEVELOPER)) {
			return new SeniorDeveloper(EmployeeType.SENIOR_DEVELOPER, 50000.00);
		}

		if(employeeType.equals(EmployeeType.JUNIOR_DEVELOPER)) {
			return new JuniorDeveloper(EmployeeType.JUNIOR_DEVELOPER, 30000.00);
		}
		
		return null;
		
	}
	
}
