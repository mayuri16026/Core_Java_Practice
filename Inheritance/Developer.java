package com.InheritanceJava;

public class Developer extends Employee {
	private int noofhrs;
	public Developer(int empId,String empName,double salary,int bonus,int noofhrs)
	{
		super(empId,empName,salary);
		this.noofhrs=noofhrs;
	}
	public int getNoofhrs() {
		return noofhrs;
	}
	public void setNoofhrs(int noofhrs) {
		this.noofhrs = noofhrs;
	}
	

}
