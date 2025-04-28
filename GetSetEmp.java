package finaloopconcept;

public class GetSetEmp {
private String EmpName;
private int EmpId;
private double Esal;
private char grade;
public void Set_EmpName(String EmpName) {
	this.EmpName=EmpName;
}
public String Get_EmpName() {
	return EmpName;
}
public void Set_EmpId(int EmpId) {
	this.EmpId=EmpId;
}
public int Get_EmpId() {
	return EmpId;
}
public void Set_Esal(double Esal) {
	this.Esal=Esal;
}
public double Get_Esal() {
	return Esal;
}
public void Set_grade(char grade) {
	this.grade=grade;
}
public char Get_grade() {
	return grade;
}
}
