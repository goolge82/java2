package com.java3;

public class Assign18 {
	
//	1.Write a Java Program to complete below requirements 
//
//	a) Take variables as studentId, studentName, gender, branchName,collegeName 
//	with corresponding data types 
//
//	b) Take a Method To display the student Details 
//
//	c) Try to add atleast two student data 
//
//
//	Note :-  Dont Take Primitive Data Types
	
	static String collegename="Saveetha";
	
	Integer stuid;
	String stuname;
	Character gender;
	String branchname;
	
	void clan() {
		
		
		System.out.println("student college:- "+ collegename );
		System.out.println("student id:- "+ stuid );
		System.out.println("student name:- "+ stuname );
		System.out.println("student gender:- "+ gender );
		System.out.println("student branch:- "+ branchname );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assign18 a1=new Assign18();
		
		a1.stuid=192211588;
		a1.stuname="charan";
		a1.gender='m';
		a1.branchname="cse";
		
		System.out.println("********** obj1 ********************");
		a1.clan();
		
Assign18 a2=new Assign18();
		
		a2.stuid=192221117;
		a2.stuname="eswar";
		a2.gender='m';
		a2.branchname="it";
		
		System.out.println("********** obj2 ********************");
		a2.clan();

	}

}
