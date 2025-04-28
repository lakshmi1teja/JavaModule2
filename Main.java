package mavenseconpackage;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter org name:");
		String ogName = c.nextLine();
		System.out.println("Enter dept name:");
		String depName = c.nextLine();
		System.out.println("Enter Emp name:");
		String emName = c.nextLine();
		Organization o = new Organization();
		o.displayOName(ogName);
		Department d = new Department();
		d.displayDName(depName);
		Employee e = new Employee();
		e.displayEName(emName);
		System.out.println("The Employee name is "+e.empName+" who belongs to "+d.deptName+" under "+o.orgName);
	}
}
class Organization{
	String orgName;
	public String displayOName(String on) {
		orgName=on;
		return on;
	}
}
class Department extends Organization{
	String deptName;
	public String displayDName(String dn) {
		deptName=dn;
		return dn;
	}
}
class Employee extends Department{
	String empName;
	public String displayEName(String en) {
		empName=en;
		return en;
	}
}
