package com.rk.test7;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("mainclass obj");
		
		//calling class
		Example exm=new Example();
		
		//static variable
		//System.out.println(exm.x);
		
		//instance variable
		//System.out.println(exm.y);
		
		//static method
		exm.staticMethod();
		
		//instance method
		exm.instanceMethod();
	}//main
}//class
