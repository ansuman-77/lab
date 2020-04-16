package com.cg.iter;

public class Employee {
	   private int employeeId;
	   private String Name;
	   private double salary;
	   private String businessUnit;
	   private int age;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String Name, double salary, String businessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.Name = Name;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age=age;
		
	}
	@Override
	public String toString() {
		return " employeeId=" + employeeId + ","+ "\n Name=" + Name + ","+ "\n salary=" + salary + ","+ "\n businessUnit=" + businessUnit + ","+ "\n age=" + age + " ";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String BusinessUnit) {
		this.businessUnit = BusinessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
