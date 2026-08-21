package com.java3;


//Java
//
//Create a Java class named Movie with the following variables and methods.
//
//Variables
//These variables should be different to all Movie objects
// > movieId – int
// > movieName – String
// > heroName – String
// > availableSeats – int
//
//Below variables should be common to all Movie objects
// > theaterName 
// > managerName
//
//
//Methods
//Create the following instance methods:
//displayMovieDetails() – Display all details of a movie.
//
//bookSeat() – Book one seat by reducing availableSeats by 1.
//
//Create the following static methods:
//displayTheaterDetails() – Display the theater name and manager name.
//
//changeManager() – Update the manager's name.
//
//In the main() method:
// > Create two Movie objects.
//Assign values to all instance and static variables.
//
// > Display the theater details.
//
// > Display the details of both movies.
//
// > Book one seat for each movie.
//
// > Display the updated details of both movies.
//
// > Change the manager's name using the changeManager() method.
// 
// > Display the updated theater details.


public class Assign13 {
	
	static String theatername;
	
	static String managername;
	
	int movieid;
	String moviename;
	String heroname;
	int availableseats;
	
	
	//displayMovieDetails() – Display all details of a movie.
	void displaymoviedetails() {
		
		System.out.println("*********** object movie details  *********************");
		System.out.println("movie number :-" + movieid);
		System.out.println("movie name :-"+ moviename);
		System.out.println("hero name:- "+ heroname);
		System.out.println("available seats:- "+availableseats);
		
	}
	
	//bookSeat() – Book one seat by reducing availableSeats by 1.

	void bookseats() {
		
		availableseats--;
		
		System.out.println("******************* available seats *********************");
		System.out.println("seat is booked  for :-  "+ moviename + " movie");
		System.out.println("availble seats:- "+ availableseats);
		
	}
	
	// > Display the theater details.
	void displaytheaterdetails() {
		
		System.out.println("************** theater details ******************");

		System.out.println("threate name:- "+ theatername);
		System.out.println("threate name:- "+ managername);
		
	}
	
	void changemanager(String s) {
		
		managername=s;
		
		displaytheaterdetails();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		theatername="rr";
		managername="harisankar";
		
		
		
		Assign13 a=new Assign13();
		
		
		a.movieid=13;
		a.moviename="My First client";
		a.heroname="lee dong-hwi";
		a.availableseats=150;
		
		
        Assign13 b=new Assign13();
		
		b.movieid=04;
		b.moviename="karati kid";
		b.heroname="jacki-chan";
		b.availableseats=130;
		
		a.displaymoviedetails();
		a.bookseats();
		a.displaytheaterdetails();
		System.out.println("*********** after changing manager name *********************");
		a.changemanager("charan");
		
		b.displaymoviedetails();
		b.bookseats();
		b.displaytheaterdetails();
		
		System.out.println("*********** after changing manager name *********************");
		b.changemanager("eswar");
		
		
		

	}

}
