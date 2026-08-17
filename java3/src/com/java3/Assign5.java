package com.java3;

public class Assign5 {
	
	
	int bookid;
	String  booktitle;
	String  authorname;
	int available_copies;
	 String library_name;
	 String librarian_name;
	
	void DisplayBookDetails() {
		
		System.out.println("************book details************");
		System.out.println("book id number:- "+bookid);
		System.out.println("book id number:- "+booktitle);
		System.out.println("book id number:- "+authorname);
		System.out.println("book id number:- "+available_copies);
	}
	
	void DisplaylibraianDetails() {
		
		System.out.println("***********library detail**********");
		System.out.println("book id number:- "+library_name);
		System.out.println("book id number:- "+librarian_name);
	}
	
	void changelibrarian() {
		
		System.out.println("************ After changing name ****************");
		librarian_name="eswar";
		DisplaylibraianDetails();

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Assign5 a = new Assign5();

	    a.bookid = 112;
	    a.booktitle = "ramayanam";
	    a.authorname = "valmiki";
	    a.available_copies = 25000;

	    a.library_name = "vishwa vidyalayam";
	    a.librarian_name = "charan";

	    System.out.println("Book 1 details:");
	    a.DisplayBookDetails();

	    System.out.println("Library details before changing:");
	    a.DisplaylibraianDetails();
	    
	   

	    a.changelibrarian();
		
//		
//		Assign5 a=new Assign5();
//		
////		Assign5 b=new Assign5();
//		
//		a.bookid=112;
//		a.booktitle="ramayanam";
//		a.authorname="valmiki";
//		a.available_copies=25000;
//		
//		 a.library_name="vishwa vidyalayam";
//		 a.librarian_name="charan";
//		 
////		 b.bookid=132;
////			b.booktitle="maha bharatam";
////			b.authorname="vedavasa";
////			b.available_copies=25000;
////			
////			 b.library_name="vishwa vidyalayam";
////			 b.librarian_name="eswar";
//
//		 System.out.println("book1 detaile:-");
//		 a.DisplayBookDetails();
//		 a.DisplaylibraianDetails();
//		 
//		 
////		 System.out.println("book2 detaile:-"); 
////		 b.DisplayBookDetails();
////		 b.DisplaylibraianDetails();	
////	
////		 a.changelibrarian();	
////		 b.changelibrarian();	
//		 
//
//		 
//		 a.changelibrarian();
	    
	    Assign7.method();
		
		

	}

}
