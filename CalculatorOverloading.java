package mavenseconpackage;

import java.util.Scanner;

public class CalculatorOverloading {
	CalculatorOverloading(int num1,int num2){
		int mul=num1*num2;
		System.out.println(mul);
	}
	CalculatorOverloading(int num1,float num2){
		float mul=num1*num2;
		System.out.println(mul);
	}
	CalculatorOverloading(int num1,double num2){
		double mul=num1*num2;
		System.out.println(mul);
	}
	CalculatorOverloading(float num1,float num2){
		float mul=num1*num2;
		System.out.println(mul);
	}
	CalculatorOverloading(float num1,double num2){
		double mul=num1*num2;
		System.out.println(mul);
	}
	CalculatorOverloading(double num1,double num2){
		double mul=num1*num2;
		System.out.println(mul);
	}
	public static void main(String args[]) {
		Scanner c = new Scanner(System.in);
		int a =c.nextInt();
		int b=c.nextInt();
		float d=c.nextFloat();
		double e=c.nextDouble();
		CalculatorOverloading col = new CalculatorOverloading(a,b);
		CalculatorOverloading col1 = new CalculatorOverloading(a,d);
		CalculatorOverloading col2 = new CalculatorOverloading(a,e);
		CalculatorOverloading col3 = new CalculatorOverloading(e,e);
		CalculatorOverloading col4 = new CalculatorOverloading(d,d);
		CalculatorOverloading col5 = new CalculatorOverloading(d,e);
	}
}

