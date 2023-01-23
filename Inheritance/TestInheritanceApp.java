package com.InheritanceJava;
import java.util.Scanner;
public class TestInheritanceApp {

	public static void main(String[] args) {
		Manager m1=new Manager(100,"Mayuri",10000,10000);
		Developer d1=new Developer(200,"Mayu",12000,10,78);
		display(m1,"Manager");
		display(d1,"Developer");
	}
		public static void display(Employee eobj,String str)
		{
			System.out.println(eobj);
			System.out.println(str+" Id :"+eobj.getempId());
			System.out.println(str+" name :"+eobj.getempName());
	        System.out.println(str+" salary :"+eobj.getsalary());
	        
	        if(eobj instanceof Manager)
	        {
	        	Manager m1=(Manager)eobj;
		        System.out.println("Employee bonus"+m1.getBonus());
		    }
	        else if(eobj instanceof Developer)
	        {
	        	Developer d1=(Developer)eobj;
	        	System.out.println("Developers no of hours worked"+d1.getNoofhrs());
	        }
		}
		
	}
