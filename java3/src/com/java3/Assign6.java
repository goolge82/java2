package com.java3;

public class Assign6 {
	
	String movie_name;
	String release_date;
	int ticket_price;
	
	void moviedetail() {
		System.out.println("movie name:- "+movie_name);
		System.out.println("release_date:- "+release_date);
		System.out.println("ticket price:- "+ticket_price);
	}
	
	void moviedetail1() {
		
		System.out.println("*************movie2 details************");
		System.out.println("movie name:- "+movie_name);
		System.out.println("release_date:- "+release_date);
		System.out.println("ticket price:- "+ticket_price);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign6 a=new Assign6();
		
		a.movie_name="salar";
		a.release_date="05/12/2024";
		a.ticket_price=250;
		
       Assign6 b=new Assign6();
		
		b.movie_name="toxic";
		b.release_date="26/08/2026";
		b.ticket_price=150;
		
		a.moviedetail();
		
		b.moviedetail1();
		

	}

}
