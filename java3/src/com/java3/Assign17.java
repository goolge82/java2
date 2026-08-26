package com.java3;

public class Assign17 {

	
//	2.Write a Java program to declare and display variables using the following literals:
//		Integer literal
	
	int a1=23;
	int a2=2456;
//	int a3=9876f; // error Type mismatch: cannot convert from float to int
	
//	-----------------------------type conversion ---------------------------------------//
	
//	int a3=(int)9876f;
//	
//	double a4=23456;
//	
//	int a5=(int)a4;
	
//	-------------------------------------------------------------------------//
	
//		Floating-point literal
//		Character literal
//		String literal
//		Boolean literal
	
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int b;
//		System.out.println(b);
		
//		int a=10;
//		System.out.println(a);
		
//		Assign17 a=new Assign17();
		
//		decimal literals
		
		int a1=1167;
		int a2=2004;
		int a3=1234;
		int a4=567;
		int a5=49000;
		
		System.out.println("********* decimal literals ****************");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);

		
//		Integer literal
		
		int b1=123;
		
//		octal starts from zero and end at 7 and base of octal is 8
//		int b4=0238; //The literal 0238 of type int is out of range
//		 but octual range 0-7 not 8 and above for octua
		
//		example:- take b2=0123 ----> 0 *8^3  + 1*8^2  + 2*8^1   +3*8^0=0+64+16+3=83
		int b2=0123;
		int b3=0567;
	
		int b4=0742;
		int b5=0555;
		
		
//	hexa starts from 0x means 0-9 and a-f/A to F
//		hexa base is 16. but we take 0-9 and a to f
//		example take b10=0xa ---------> 0x *16^1+a*16^0= 0+a(a=10)=10
		int b6=0xaaed;
		int b7=0xbcdef;
		int b8=0x345123ff;
		int b9=0xffeab123;
		int b10=0xa;
		

		System.out.println("********* Integer literals ****************");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		System.out.println(b9);
		System.out.println(b10);
		
		
//		Floating-point literal
		
		float c1=23;
		float c2=123;
		float c3=0123;
		float c4=0345;
		
		float c5=0345.8f;
		float c6=03412f;
		float c7=01230;
		float c8=0x123f;
//		float c9=0xaadf.5f; Invalid hex literal number
		
//		float c6=0x345.5f; //invalid hex literal number
		
		System.out.println("********* float literals ****************");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		
		
		
		
//		character  literals
		
		char e='A';
		int f=65;
		
		char e1='\u0021';
		char e2='\u0041';
		char e3='\u0031';
		
		System.out.println("********* character  literals ****************");
		System.out.println(e);
		System.out.println((int)e);
		System.out.println((char)f);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		
//		String literal
		
		String s1=("charan");
		String s2=new String("enimi");
		
		System.out.println("********* string  literals ****************");
		System.out.println(s1);
		System.out.println(s2);
		
		
//			Boolean literal
		
		boolean isitfine = true;
		
		if(isitfine) {
			System.out.println("good ");
		}
		else {
			System.out.println("bad");
			
		}
		
//		 double literal
		
		double g1=234.5d;
		double g2=0234;
		double g3=0345.5d;
		double g4=0xad;
//		double g5=0xa56.54d; Invalid hex literal number
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
		
		
	}

}
