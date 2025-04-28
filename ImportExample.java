package javapackage2;

public class ImportExample {
	public void display() {
		System.out.println("Display my matter");
	}
	public int show(int a) {
		return a;
	}
	public double grossSalCal(double sal) {
		double gross = sal+(sal*10/100);
		return gross;
	}
	public void factorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public double areaOfCircle(int r) {
		double pi=3.14;
		double area=pi*r*r;
		return area;
	}
	public int[] printArray(int[] arr) {
		return arr;
	}
}
