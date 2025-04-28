package newjavapackage;

import java.util.Scanner;

import javapackage2.ImportExample;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImportExample ie2=new ImportExample();
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the case Id:");
		int caseId = c.nextInt();
		switch(caseId) {
		case 1:
			double cirarea = ie2.areaOfCircle(2);
			System.out.println(cirarea);
			break;
		case 2:
			ie2.factorial(3);
			break;
		case 3:
			double salgross = ie2.grossSalCal(120000.45);
			System.out.println(salgross);
			break;
		default:
			System.out.println("Invalid caseId");
		}
	}

}
