package com.java3;

public class Assign10 {
	
	static String company;
	
	int emp_id;
	String emp_name;
	int sal;
	String exp;
	String grade;
	String permanent_status;
	
	
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
		
		   Assign10 a = new Assign10();

	        a.emp_id = 1;
	        a.emp_name = "Charan";
	        a.sal = 120000;
	        a.exp = "8 years";
	        a.grade = "A+";
	        a.permanent_status = "Permanent";


	        // Object 2
	        Assign10  b = new Assign10();

	        b.emp_id = 2;
	        b.emp_name = "Vishwa";
	        b.sal = 90000;
	        b.exp = "5 years";
	        b.grade = "A";
	        b.permanent_status = "Permanent";


	        // Object 3
	        Assign10 c = new Assign10();

	        c.emp_id = 3;
	        c.emp_name = "Eswar";
	        c.sal = 60000;
	        c.exp = "2 years";
	        c.grade = "B+";
	        c.permanent_status = "Temporary";
	        
	        a.display();
	        
	        b.display();
	        
	        c.display();

	}

}
