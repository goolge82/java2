package com.java3;

public class Assign9 {
	
//	back account details
	
	static String bank;
	
	static int accountno;
	{
		accountno++;
	}
	
	String bankholder_name;
	int balance;
	String branch;
	
	void display() {
		
		System.out.println("***** account details **********");
		
		System.out.println("account no :-"+ accountno);
		
		System.out.println("bank name :- "+ bank);
		System.out.println("bank name :- "+ bankholder_name);
		System.out.println("bank name :- "+ balance);
		System.out.println("bank name :- "+ branch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assign9 a=new Assign9();
		
		bank="union bank";
		
		a.bankholder_name="charan";
		a.balance=2000;
		a.branch="srikalahasti";
		
		a.display();
		
       Assign9 b=new Assign9();
       
       bank="union bank";
		
		b.bankholder_name="eswar";
		b.balance=20000;
		b.branch="srikalahasti";
		
		b.display();

	}

}
