package com.java3;

public class Assign11 {
	
//	static {
//		
//		new Assign11().clash();
//		new Assign11().clash1();
//		new Assign11().clash2();
//		new Assign11().clash3();
//	}
	
//	we can do through anoumyous object 
	
//	but in simple way what we know

	
	static {
		
		Assign11 a=new Assign11();
		
		a.clash();
	}
	
	void clash() {
		
		System.out.println("enter");
		clash1();
		
		
	}
	void clash1() {
		System.out.println("enter1");
		clash2();
		
	}
	
	void clash2() {
		System.out.println("enter2");
		clash3();
	}
	
	void clash3() {
		System.out.println("enter3");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Assign11 a=new Assign11();
//		
//		a.clash();
		
		System.out.println("hi");

	}

}
