package interface2package;

import java.util.Scanner;

import interfacesandmultipleinhe.Author;
import interfacesandmultipleinhe.Publisher;

public class BookClassOne implements Publisher,Author{

	Scanner c = new Scanner(System.in);
	public String authorNameDetails() {
		System.out.println("Enter the author name:");
		String authorname = c.nextLine();
		return authorname;
	}


	public int authorIdDetails() {
		System.out.println("Enter author ID:");
		int authorid = c.nextInt();
		c.nextLine(); 
		return authorid;
	}


	public double authorRemunerationDetails() {
		System.out.println("Enter author remunation:");
		double authorremuneration=c.nextDouble();
		c.nextLine(); 
		return authorremuneration;
	}


	public int authorExpDetails() {
		System.out.println("Enter author Experiance");
		int authorexperience=c.nextInt();
		c.nextLine(); 
		return authorexperience;
	}


	public String publisherNameDetails() {
		System.out.println("Enter publisher Name:");
		String publishername = c.nextLine();
		return publishername;
	}

	public int publisherIdDetails() {
		System.out.println("Enter publisher ID details:");
		int publisherid = c.nextInt();
		c.nextLine(); 
		return publisherid;
	}

	public String publisherOwnerDetails() {
		System.out.println("Enter owner Details:");
		String publisherowner = c.nextLine();
		return publisherowner;
	}

	public int publisherExperienceDetails() {
		System.out.println("Enter publisher Experiance:");
		int publisherexperiance = c.nextInt();
		c.nextLine(); 
		return publisherexperiance;
	}


	
}
