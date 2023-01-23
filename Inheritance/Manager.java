package com.InheritanceJava;

public class Manager extends Employee 
{

	private int bonus;
	public Manager(int empId,String empName,double salary,int bonus)
	{
		super(empId,empName,salary);
		this.bonus=bonus;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}

