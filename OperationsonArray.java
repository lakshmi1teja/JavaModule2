package newjavapackage;

import java.util.Arrays;

public class OperationsonArray {
	public int[] arrayAsc(int arr[]) {
		Arrays.sort(arr);
		return arr;
	}
	public int[] arrayDec(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public double arrayAvg(int arr[]) {
		int sum=0;
		for(int num: arr) {
			sum+=num;
		}
		return (double) sum/arr.length;
	}
}
