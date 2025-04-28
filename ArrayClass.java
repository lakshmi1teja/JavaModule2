package javapackage2;

import java.util.Scanner;

import newjavapackage.OperationsonArray;

public class ArrayClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[4];
		System.out.println("Enter array values:");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		OperationsonArray oa = new OperationsonArray();
		OperationsonArray da = new OperationsonArray();
		OperationsonArray avg = new OperationsonArray();
		int[] sortedArr = oa.arrayAsc(array);
		int [] decArr = da.arrayDec(array);
		double calavg = avg.arrayAvg(array);
		System.out.println(calavg);
		System.out.println("the sorted arrar");
		for(int x : decArr) {
			System.out.println(x);
		}
	}
}
