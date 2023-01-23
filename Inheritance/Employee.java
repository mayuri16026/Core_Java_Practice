package com.InheritanceJava;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	public Employee(int empId,String empName,double salary)
	{
		super();
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	public int getempId()
	{
		return empId;
	}
	public String getempName()
	{
		return empName;
		
	}
	public double getsalary()
	{
		return salary;
	}

}
