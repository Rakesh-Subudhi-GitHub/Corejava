package com.rk.test7;

public class Example {
	
	//instance variable
	 int y=10;
	
	//static variable
	 static int x=20;
	
	//static method
	public static void staticMethod()
	{
		System.out.println("static method");
		x=30;
		System.out.println("static obj is change it  x value modify");
		System.out.println(x);
	}
	
	//instance method
	public void instanceMethod()
	{
		System.out.println("instance method");
		x=30;
		y=30;
		System.out.println("x or y value is chanage it");
		System.out.println(x+"  "+y);
	}
	

}//class
