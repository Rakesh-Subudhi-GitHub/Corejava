package com.rk.test8;

public class WrapperClass {

	public static void main(String[] args) {
		
		//valueOf() method use
		Integer i=Integer.valueOf("20");
		System.out.println(".valueOf(20)  chek= (string value to integer convert)::::"+i);
		//binary convert
		Integer i1=Integer.valueOf("1111",2);
		System.out.println(".valueOf(10101)  chek= (string +binary value to integer convert)::::"+i1);
		Double d=Double.valueOf("20.23");
		System.out.println(".valueOf(d)  chek= (string value to double convert)::::"+d);
		
		//ParseXxx method use
		int a=Integer.parseInt("20");
		System.out.println(".parseInt(20)  chek= (string value to integer convert)::::"+a);
		
		Integer a1=Integer.valueOf("1111",2);
		System.out.println(".parseInt(10101)  chek= (string +binary value to integer convert)::::"+a1);
		double b= Double.parseDouble("20.23");
		System.out.println(".ParseDouble(20.23)  chek= (string value to integer convert)::::"+b);
		
		//XxxValue
		int c=i.intValue();
		System.out.println("obj ref to conevert obj.xxxValue()"+c);
	}

}
