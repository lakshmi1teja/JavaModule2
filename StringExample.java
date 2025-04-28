package javapackage2;
import java.util.Scanner;
public class StringExample {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = sc.next();
	        
	        // Directly extract the substring
	        String sub = str.substring(0, 2);
	        System.out.println("Substring: " + sub);
	        String p1 = "hey tej!";
	        int h1 = p1.hashCode();
	        System.out.println(h1);
	    }
	}


