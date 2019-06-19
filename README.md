# Factory Method Pattern
Factory Method Pattern falls under **Creational Design Patterns** which means that it has to do with **the way of creating objects.**

To use Factory Method Pattern,
* Define an Interface or an Abstract class
* Let the subclasses decide which class to instantiate. i.e. Which class to extend.

The factory is responsible for instantiating the sub class for us.

**Advantage of Factory Design Pattern**
- Factory Method Pattern allows the sub-classes to choose the type of objects to create.
- It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code. 


**Our scenario**
In a company, there are many employees.
- Manager
- Team Leader
- Senior Developer
- Junior Developer

Each employee has a basic salary.
However there transport allowance is calculated based on their basic salary.
For example: Manager gets 10% of their basix salary as transport allowance. Meaning (basicSalary * 0.1)

**In this example**
We are writing a simple program to output the basis salary of an employee.
We will be using:
- 1 Abstract Parent Class (Employee)
- 3 Subclasses of the Employee Class ( Manager, TeamLeader,SeniorDeveloper, JuniorDeveloper )
- 1 Factory Class (EmployeeFactory)
