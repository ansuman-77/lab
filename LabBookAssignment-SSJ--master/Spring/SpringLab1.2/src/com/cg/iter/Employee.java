package com.cg.iter;

public class Employee {
	   private int empAge;
	   private int empId;
	   private String empName;
	   private double salary;
	   private SBU SBU;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empAge, int empId, String empName, double salary, SBU SBU) {
		super();
		this.empAge = empAge;
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.SBU = SBU;
	}
	@Override
	public String toString() {
		return "Employee [empAge=" + empAge + ", empId=" + empId + ", empName=" + empName
				+ ", salary=" + salary + "]\nSBU DETAILS=" + SBU + "]";
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBU getSBU() {
		return SBU;
	}
	public void setSBU(SBU SBU) {
		this.SBU = SBU;
	}
}
