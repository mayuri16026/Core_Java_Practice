package com.OverloadingJava;
import java.util.Scanner;

//Method Overloading...

public class Area_App {
	public void  CalcArea(float r)
	//Here we have used same method name for calculating area of say circle and rectangle ..
	{
		float Circle_Area=3.14f*r*r;
		System.out.println("Area of Circle is:"+Circle_Area);
	}
	public void CalcArea(float l,float b)
	{
		float Rect_Area=l*b;
		System.out.println("Area of the Rectangle is:"+Rect_Area);
	}
	public void Tri_Area(float b,float h)
	//As the return type cannot be the same we cannot use the same method name in that case..
	//see (float,float)..
	//we must have the different signature for that ..
	{
		float Triangle_Area=0.5f*b*h;
		System.out.println("Area of The Triangle is :"+Triangle_Area);
	}

}
