package com.java3;

public class Swap {
	
//	Write a Java Program to Swap two variables data using Arithmetic operators and using Temporary Variable
//
//	Ex:- a=10,
//	        b= 20
//	Output :- 
//	a=20,
//	b= 10

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		System.out.println("---------------------befor -swapping---------------");
		System.out.println("a value is:- "+ a);
		System.out.println("b value is:- "+b);
		
//		swp the a and b through bit wise operators

		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("---------------------After -swapping---------------");
		System.out.println("a value is:- "+ a);
		System.out.println("b value is:- "+b);
		
		
		int c=10;
		int d=20;
		
		System.out.println("---------------------befor -swapping---------------");
		System.out.println("c value is:- "+ c);
		System.out.println("d value is:- "+d);
		
//		swp the a and b through bit wise operators

		
		int t=c+d;
		d=d-c;
		c=t-c;		
		System.out.println("---------------------After -swapping---------------");
		System.out.println("c value is:- "+ c);
		System.out.println("d value is:- "+d);

		
	}

}
