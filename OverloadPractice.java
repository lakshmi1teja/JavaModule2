package javapackage2;

public class OverloadPractice {
	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 2;
		double do1 = 1.2;
		double do2 = 2.3;
		float fo1 = 2.0f;
		float fo2 = 3.0f;
		String st1 = "hi";
		String st2 = "Guys";
		DoOverloading dol1 = new DoOverloading(number1,number2);
		DoOverloading dol2 = new DoOverloading(do1,do2);
		DoOverloading dol3 = new DoOverloading(fo1,fo2);
		DoOverloading dol4 = new DoOverloading(st1,st2);
		System.out.println(dol1.num1+dol1.num2);
		System.out.println(dol2.doub1+dol2.doub2);
		System.out.println(dol3.fl1+dol3.fl2);
		System.out.println(dol4.str1+dol4.str2);
	}
}
class DoOverloading{
	int num1,num2;
	double doub1,doub2;
	float fl1,fl2;
	String str1,str2;
	DoOverloading(int n1,int n2){
		this.num1=n1;
		this.num2=n2;

	}
	DoOverloading(double d1,double d2){
		this.doub1=d1;
		this.doub2=d2;

	}
	DoOverloading(float f1,float f2){
		this.fl1=f1;
		this.fl2=f2;

	}
	DoOverloading(String s1,String s2){
		this.str1=s1;
		this.str2=s2;

	}
}