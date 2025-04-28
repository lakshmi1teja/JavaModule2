package javapackage2;

import java.util.Scanner;

public class NextInputExampple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		String fname = sc.next();
		String lname = sc.next();
		String city = sc.next();
		System.out.println(a);
		System.out.println(fname+" "+lname+" "+city);
	}
}
