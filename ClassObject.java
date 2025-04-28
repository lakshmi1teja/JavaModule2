package javapackage2;


public class ClassObject{
	public static void main(String args[]) {
		Employee em = new Employee();
		
		System.out.println("Enter information:"+" "+em.name+" "+em.age+" "+em.empId);
	}
}
class Employee {
	String name;
	int age;
	String empId;
	Employee(){
		name = "Josh";
		age=23;
		empId="EM2345";
	}
}
