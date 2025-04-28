package mavenpackagepractice;

import java.util.Scanner;

public class OverrideExample {

	public static void main(String[] args) {
		A obj = new A();
		B obj1 = new B();
		C obj2 = new C();
		Scanner c = new Scanner(System.in);
		int a=c.nextInt();
		int b=c.nextInt();
		int d=c.nextInt();
		int num1=obj.calculateFactorial(a);
		int num2=obj1.calculateFactorial(b);
		int num3=obj2.calculateFactorial(d);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}
class A{
	int f;
	public int calculateFactorial(int n) {
		f=n;
		if(n==0) {
			return 1;
		}
		else {
			return n*calculateFactorial(n-1);
		}
	}
}
class B extends A{
	int f1;
	public int calculateFactorial(int x) {
		f1=x;
		if(x==0) {
			return 1;
		}
		else {
			return x*calculateFactorial(x-1);
		}
	}
}
class C extends B{
	int f2;
	public int calculateFactorial(int y) {
		f2=y;
		if(y==0) {
			return 1;
		}
		else {
			return y*calculateFactorial(y-1);
		}
	}
}