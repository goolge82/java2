package com.java3;

public class methodcount {
	
	static int count=0;
	{
		count++;
	}
	
	void clash() {
//		clash1();
		System.out.println("method started");
		
	}
	void clash1() {
		System.out.println("method 1 started");
		
	}
	void clash2() {
		System.out.println("method 2 started");
		
	}
	void clash3() {
		System.out.println("method 3 started");
		
	}
	void clash4() {
		System.out.println("method 4 started");
		
	}
	void clash5() {
		System.out.println("method 5 started");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodcount mc=new methodcount();
		methodcount mc1=new methodcount();
		methodcount mc2=new methodcount();
		methodcount mc3=new methodcount();
		methodcount mc4=new methodcount();
		methodcount mc5=new methodcount();
		
		
		mc.clash();
		mc1.clash1();
		mc2.clash2();
		mc3.clash3();
		mc4.clash4();
		mc5.clash5();
		
		System.out.println("method counts :- "+count);
	}

}
