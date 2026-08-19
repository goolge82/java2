package com.java3;

//1.A company wants to store employee information.
//Create an Employee class with:
//Employee ID
//Employee name
//Salary
//Experience
//Grade
//Permanent status
//Use appropriate primitive data types wherever possible.
//Create 3 employee objects and display their details.

//Use 
//Static variable
//Instance variables
//Static block
//Instance block
//Static method
//Instance method
//Object creation

public class Assign8 {
	
	static String company_name;
	
	int emp_id;
	String emp_name;
	int sal;
	String exp;
	String grade;
	String permanent_status;
	
	static void method() {
		
		Assign8 a=new Assign8();
		
		a.emp_id=1;
		a.emp_name="charan";
		a.sal=120000;
		a.exp="8 years";
		a.grade="A+";
		a.permanent_status="senior";
		
		
		a.display();
		
		
		
	}
	
	void display(){
		System.out.println("*************** employee-details *******************");
		
		System.out.println("employee number:- "+emp_id);
		System.out.println("employee number:- "+emp_name);
		System.out.println("employee number:- "+sal);
		System.out.println("employee number:- "+exp);
		System.out.println("employee number:- "+grade);
		System.out.println("employee number:- "+permanent_status);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		company_name="tata";
		
		method();

	}

}
