package com.rk.test9;

public class CommandLineArguments_Sum {

	public static void main(String[] args) {
		int s=0;
		for(int i=0;i<args.length;i++)
		{
			System.out.println("value is= "+args[i]);
			s=s+Integer.parseInt(args[i]);
		}
		System.out.println("total sum is= "+s);
	}

}
