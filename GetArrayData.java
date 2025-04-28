package finaloopconcept;

import java.util.Arrays;
import java.util.Scanner;

public class GetArrayData {

	public static void main(String[] args) {
		ArrayGetSet ags=new ArrayGetSet();
		Scanner c=new Scanner(System.in);
		int[] inputarr= new int[5];
		System.out.println("Enter array elements:");
		for(int i=0;i<inputarr.length;i++) {
			inputarr[i]=c.nextInt();
		}
		ags.Set_array(inputarr);
		System.out.println(Arrays.toString(ags.Get_array()));
	}

}
