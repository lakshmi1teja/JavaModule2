package collectionsdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Scenario2 {
	int[] arr = {1,2,3,4,5};
	public void SentArrayToLinkedList() {
		LinkedList<Integer> l1 = new LinkedList();
		for(int i=0;i<arr.length;i++) {
			l1.add(arr[i]);
		}
		System.out.println(l1);
	}
	public void ReverseList() {
		LinkedList<Integer> l1 = new LinkedList(Arrays.asList(10,25,16,45,30));
		Iterator i1 = l1.descendingIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
	public static void main(String[] args) {
		Scenario2 s = new Scenario2();
		s.SentArrayToLinkedList();
		s.ReverseList();
	}
}
