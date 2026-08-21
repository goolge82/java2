package com.java3;

public class Assign12 {
	
//	1.A library wants to maintain details of its books. Book details are unique, while library name and librarian name are common for all books.
//	Create a LibraryBook class with
//	Variables
//	bookId
//	bookTitle
//	authorName
//	availableCopies
//	libraryName
//	librarianName
//	Methods:
//	displayBookDetails()
//	issueBook() – Reduce availableCopies by 1
//	displayLibraryDetails()
//	changeLibrarian() – ->Update the librarian name.
//	->Create 2 LibraryBook objects.
//	->Assign values to all variables.
//	->Display library and book details.
//	->Issue one copy of each book.
	
//	static int availableCopies=0;
	
	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies;
	String libraryName;
	String librarianName;
	
	void displaybookdetails() {
		
		System.out.println(" book id number:- "+ bookId);
		System.out.println(" book name:- "+ bookTitle);
		System.out.println(" author name;- "+ authorName);
		System.out.println(" how many books available copies :- "+ availableCopies);
		
	}
	
	void issue() {
		availableCopies--;
		System.out.println(" how many books after issuing available copies :- "+ availableCopies);
	}
	
	void librarydetails() {
		
		System.out.println(" library name :- " + libraryName);
		System.out.println(" librarianName :- " + librarianName);
		
	}
	
	void changelibrarian(String s) {
		
		
		librarianName=s;
		librarydetails();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assign12 a=new Assign12();
		
		System.out.println("*********************** book1 details *****************************");
		
		a.bookId=1453;
		a.bookTitle="java";
		a.authorName ="Srikanth";
		a.availableCopies= 10;
		a.libraryName="vcube";
		a.librarianName="charan";
		
		a.displaybookdetails();
		a.issue();
		
		System.out.println("**************** library details **************************");
		a.librarydetails();
		
		System.out.println("******* after changeing librarin details *********");
		
		a.changelibrarian("eswar");
		
		
		
		System.out.println("*********** second object *****************");
		
		Assign12 b=new Assign12();
		
		System.out.println("*********************** book2 details *****************************");
		b.bookId=1253;
		b.bookTitle="Mysql";
		b.authorName ="viswanth";
		b.availableCopies= 9;
		b.libraryName="vcube";
		b.librarianName="naveen";
		
        b.displaybookdetails();
        
        b.issue();
		
        System.out.println("**************** library details **************************");
		b.librarydetails();
		
		System.out.println("******* after changeing librarin details *********");
		
		b.changelibrarian("charan");
		
		
//		System.out.println(" how many books available copies :- "+ availableCopies);

	}

}
