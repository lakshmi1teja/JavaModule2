package finaloopconcept;

import java.util.Scanner;

public class SetData {
public static void main(String[] args) {
	GetSetEmp gse=new GetSetEmp();
	Scanner c = new Scanner(System.in);
	System.out.println("Enter the name:");
	gse.Set_EmpName(c.nextLine());
	System.out.println("Enter the Id:");
	gse.Set_EmpId(c.nextInt());
	System.out.println("Enter the salary:");
	gse.Set_Esal(c.nextDouble());
	System.out.println("Enter the grade:");
	gse.Set_grade(c.next().charAt(0));
	System.out.println(gse.Get_EmpName());
	System.out.println(gse.Get_EmpId());
	System.out.println(gse.Get_Esal());
	System.out.println(gse.Get_grade());
}
}
