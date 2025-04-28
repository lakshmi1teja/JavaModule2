package newjavapackage;

import javapackage2.ImportExample;

public class Firstcode {

	public static void main(String[] args) {
		ImportExample ie=new ImportExample();
		ie.display();
		System.out.println(ie.show(10));
		double gs = ie.grossSalCal(28000.00);
		System.out.println(gs);
		ie.factorial(5);
		double a=ie.areaOfCircle(2);
		System.out.println(a);
		int[] array={1,2,3,4,5};
		int[] resultArray = ie.printArray(array);
	
		for(int i:resultArray) {
			System.out.print(i+" ");
		}
	}

}
