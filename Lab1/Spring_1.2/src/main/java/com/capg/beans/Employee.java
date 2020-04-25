package com.capg.beans;

import com.capg.sbu.Sbu;

public class Employee 
{
	private int EmployeeId;
	private String EmployeeName;
	private int age;
	private String businessUnit;
	private double salary;
	private Sbu sbu;
	
	public Sbu getSbu()
	{
		return sbu;
	}
	public void setSbu(Sbu sbu)
	{
		this.sbu = sbu;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public int getAge() {
		return age;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public double getSalary() {
		return salary;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [EmployeeId=").append(EmployeeId).append(", EmployeeName=").append(EmployeeName)
				.append(", age=").append(age).append(", businessUnit=").append(businessUnit).append(", salary=")
				.append(salary).append("]");
		return builder.toString();
	}

}
