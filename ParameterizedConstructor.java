package newjavapackage;

import java.util.Scanner;

public class ParameterizedConstructor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many employees:");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the details of employee "+i+":");
			System.out.print("Name: ");
			String ename = sc.nextLine();
			System.out.println("age:");
			int age = sc.nextInt();
			System.out.println("salary:");
			double sal = sc.nextDouble();
			System.out.println("Employee Id:");
			int eid = sc.nextInt();
			sc.nextLine();
			Employee obj = new Employee(ename,age,sal,eid);
			System.out.println(obj.ename+" "+obj.age+" "+obj.sal+" "+obj.eid);
			
		}
		
	}
}
class Employee{
	String ename;
	int age;
	double sal;
	int eid;
	Employee(String name,int age,double sal,int empid){
		this.ename=name;
		this.age = age;
		this.sal = sal;
		this.eid=empid;
	}
	
}

