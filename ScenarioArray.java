package collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ScenarioArray {
	public int MaxValArray() {
		ArrayList<Integer> ali1 = new ArrayList(Arrays.asList(1,2,3,4,5));
		int maxi=Collections.max(ali1);
		return maxi;
	}
	public int MinValArray() {
		ArrayList<Integer> ali2 = new ArrayList(Arrays.asList(1,2,3,4,5));
		int mini=Collections.min(ali2);
		return mini;
	}
	public int AvgValArray() {
		ArrayList<Integer> ali2 = new ArrayList(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> ali1 = new ArrayList(Arrays.asList(1,2,3,4,5));
		int avere = (Collections.max(ali2)+Collections.min(ali1))/2;
		return avere;
	}
	public ArrayList<String> StringArray() {
		ArrayList<String> ali3 = new ArrayList(Arrays.asList("Kol","Hyd","Nlr","Pun","Viz"));
		return ali3;
	}
	public boolean ValidateList() {
		ArrayList <String> al16= new ArrayList(Arrays.asList("Kol","Hyd","Nlr","Pun","Viz"));
		if(al16.contains("Kol")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public ArrayList<String> StatesArray(){
		ArrayList<String> ali3 = new ArrayList(Arrays.asList("Kol","Hyd","Nlr","Pun","Viz"));
		ArrayList <String> ali7= new ArrayList(Arrays.asList("WB","Tel","Ap","MH","Ap"));
		ali3.addAll(ali7);
		return ali3;
		
	}
}
