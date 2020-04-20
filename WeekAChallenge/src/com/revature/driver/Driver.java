package com.revature.driver;
import java.util.*;
import com.revature.beans.*;


public class Driver {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Cars c = new Cars();
		Movies m = new Movies();
		
		//Take user input and print movie information
		System.out.println("Enter Genre");
		String genre = s.nextLine();
		m.setGenre(genre);
		System.out.println("Enter Title");
		String title = s.nextLine();
		m.setTitle(title);
		System.out.println("Enter release year");
		String releaseYear = s.nextLine();
		m.setReleaseYear(releaseYear);
		System.out.println("Genre: " + m.getGenre() + " Title: " + m.getTitle() + " Release Year: " + m.getReleaseYear());
		
		//Take user input and print car information
		System.out.println("Enter Make");
		String make = s.nextLine();
		c.setMake(make);
		System.out.println("Enter Model");
		String model = s.nextLine();
		c.setModel(model);
		System.out.println("Enter year");
		String year = s.nextLine();
		c.setYear(year);
		System.out.println("Make: " + c.getMake() + " Model: " + c.getModel() + " Year: " + c.getYear());
		
		
		
		//Prints even numbers, my favorite and least favorite numbers, and all numbers divisible by 5 up to 100
		Integer num = new Integer(100);
		
		for(int j = 0; j <= (int)num; j++) {
			if (j % 2 == 0 && j != 12) {
				System.out.println(j);
			}
			else if (j % 5 == 0) {
				System.out.println(j);
			}
			else {
				switch (j) {
				case 47:
					System.out.println("47 is my favorite number");
					break;
				case 12:
					System.out.println("12 is quite a nasty number");
					break;
				default:
					break;
				}
			}
		}	
		
		//loop prints number until it reaches a limit and utilizes wrappers
		Double d = new Double(1.12345);
		double i = 1;
		do {
			System.out.println(i);
			i = i + i / 12345;
		} while (i <= (double)d);
		
		
		//overloading setter for genre so that user can set up to 3 genres
		m.setGenre("Adventure", "action");
		System.out.println(m.getGenre() + " " + m.getGenre2());
		m.setGenre("Horror", "Comedy", "Mystery");
		System.out.println(m.getGenre() + " " + m.getGenre2() + " " + m.getGenre3());
		
		
		//for each loop that prints out genres for a given array
		String[] genres = {m.getGenre(), m.getGenre2(), m.getGenre3()};
		
		for(String z : genres) {
			System.out.println(z.toCharArray());
		}
		
		
	}
	
}
