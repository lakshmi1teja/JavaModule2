package collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.sun.tools.javac.code.Attribute.Array;

public class Lib_ArrayList {
	Scanner c = new Scanner(System.in);
	public void CreateAnArray() {
		ArrayList<Integer>  al= new ArrayList();
		al.add(109);
		al.add(203);
		al.add(103);
		al.add(67);
		System.out.println(al);
	}
		public ArrayList CreatAnArrayListTest() {
			ArrayList<Integer>  al= new ArrayList();
			al.add(109);
			al.add(203);
			al.add(103);
			al.add(67);
			return(al);
		}
		public ArrayList<Integer> TakeIp() {
			ArrayList<Integer> all = new ArrayList<>();
			System.out.println("how many number should enter:");
			int n = c.nextInt();
			for(int i=0;i<n;i++) {
				all.add(c.nextInt());
			}
			return all;
		}
		public void JoinTwoArrayList() {
			List<Integer> li = Arrays.asList(1,2,3,4);
			System.out.println(li);
		}
		public ArrayList JoinTwoArrayListTest() {
			ArrayList ali1 = new ArrayList(Arrays.asList(1,2,3,4,5));
			ArrayList ali2 = new ArrayList(Arrays.asList(11,22,33,44,55));
			ali1.addAll(ali2);
			return ali1;
		}
		public ArrayList TakeDateFromArraytoArrayList() {
			ArrayList<Integer> al9 = new ArrayList<>();
			int ip[]= {99,111,222,333};
			for (int i = 0; i < ip.length; i++)  {
				al9.add(ip[i]);
			}
			return al9;
		}
		public void ArrayListTraversalOne() {
			ArrayList al10 = new ArrayList(Arrays.asList(11,22,33,44,55));
			Iterator it = al10.iterator();
			//it.hasNext();
			//it.next();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		public void ArrayListTraveraltwo() {
			ArrayList<Integer> al11 = new ArrayList(Arrays.asList(111,222,333,444,555));
			for(int i:al11) {
				System.out.println(i+" ");
			}
					
		}
		public int RandomDataAccessFromArrayLists() {
			ArrayList<Integer> al12 = new ArrayList(Arrays.asList(10,90,45,67));
			int res = al12.get(3);
			return res;
		}
		public ArrayList InsertDataInList() {
			ArrayList<Integer> al13 = new ArrayList(Arrays.asList(10,90,45,67));
			al13.add(al13.size()-1,13);
			//al13.set(2, null);
			return al13;
		}
		//Update
		public ArrayList UpdateList() {
			ArrayList <Integer> al14= new ArrayList(Arrays.asList(10,90,45,67));
			al14.set(2, 73);
			return al14;
		}
		//delete
		public ArrayList DeleteList() {
			ArrayList <Integer> al15= new ArrayList(Arrays.asList(10,90,45,67));
			al15.remove(3);
			return al15;
		}
		//validation
		public boolean ValidateList() {
			ArrayList <Integer> al16= new ArrayList(Arrays.asList(10,90,45,67));
			if(al16.contains(190)) {
				return true;
			}
			else {
				return false;
			}
			
		}
		public String ConvertDataToArray() {
			ArrayList <Integer> al17= new ArrayList(Arrays.asList(10,90,45,67));
			Object[] rest=al17.toArray();
			return Arrays.toString(rest);
		}
		public ArrayList SortList() {
			ArrayList <Integer> al18= new ArrayList(Arrays.asList(10,90,45,67));
			Collections.sort(al18);
			return al18;
			
		}
		public int SearchList() {
			ArrayList <Integer> al19= new ArrayList(Arrays.asList(10,90,45,67));
			Collections.sort(al19);
			int ind = Collections.binarySearch(al19, 90);
			return ind;
		}
}
