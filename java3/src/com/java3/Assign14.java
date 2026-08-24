package com.java3;


//1.Create a Java program to store and display the following student details:
//Variables 
//Student name
//Age
//Admission year
//Roll number
//Mobile number
//Attendance percentage
//Total fees
//Grade
//Pass/Fail status
//Large student ID
//Fee paid
//Display all the details with suitable values.
//Note : Use relevant data types

public class Assign14 {
	String Studentname;
	int Age;
	int Admissionyear;
	int Rollnumber;
	long Mobilenumber;
	float Attendancepercentage;
	long Totalfees;
	String Grade;
	String Pass_Failstatus;
	long LargestudentID;
	String Feepaid;
	
	void duke() {
		System.out.println("Student name:- "+Studentname);
		System.out.println("Age:- "+Age);
		System.out.println("Admission year:- "+Admissionyear);
		System.out.println("Roll number:- "+Rollnumber);
		System.out.println("Mobilenumber:- "+Mobilenumber);
		System.out.println("Attendance percentage:- "+Attendancepercentage);
		System.out.println("Total fees:- "+Totalfees);
		System.out.println("Grade:- "+Grade);
		System.out.println("Pass/ Fail status:- "+Pass_Failstatus);
		System.out.println("Large studentID:- "+LargestudentID);
		System.out.println("Feepaid:- "+Feepaid);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assign14 a=new Assign14();
		
		a.Studentname="chittem";
		a.Age=22;
		a.Admissionyear=2022;
		a.Rollnumber=192211588;
		a.Mobilenumber=8317687321l;
		a.Attendancepercentage=98;
		a.Totalfees=150000;
		a.Grade="A";
		a.Pass_Failstatus="pass";
		a.LargestudentID=3456217854l;
		a.Feepaid="paid";
		
		System.out.println("****************** obj-1 **********************");
		a.duke();
	
		
Assign14 b=new Assign14();
		
		b.Studentname="enimi";
		b.Age=22;
		b.Admissionyear=2022;
		b.Rollnumber=192221117;
		b.Mobilenumber=8374940081l;
		b.Attendancepercentage=99;
		b.Totalfees=150000;
		b.Grade="A";
		b.Pass_Failstatus="pass";
		b.LargestudentID=4567893219l;
		b.Feepaid="paid";
		
		System.out.println("****************** obj-2 **********************");
		b.duke();
		
		

	}

}
