package collectionsdemo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
	public LinkedList ThisIsALinkedList() {
		LinkedList<Integer> l = new LinkedList(Arrays.asList(10,25,16,45,30));
		return l;
	}
	public LinkedList LoadDataInLinkedList() {
		LinkedList <String> cities = new LinkedList();
		cities.add("Hyd");
		cities.add("Pun");
		cities.add("Viz");
		cities.add("Chennai");
		cities.add("Kol");
		cities.add("Ban");
		LinkedList city = new LinkedList(cities);
		return city;
	}
	public LinkedList AddFirstDemo() {
		LinkedList<Integer> l = new LinkedList(Arrays.asList(10,25,16,45,30));
		l.addFirst(101);
		return l;
	}
	public LinkedList AddTwoLists() {
		LinkedList <Integer> ll1 = new LinkedList(Arrays.asList(10,25,16,45,30));
		LinkedList <Integer> ll2 = new LinkedList(Arrays.asList(41,32,61,13));
		ll1.addAll(ll2);
		return ll1;
	}
	public void TraverseList() {
		LinkedList <Integer> ll1 = new LinkedList(Arrays.asList(10,25,16,45,30));
		Iterator it = ll1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void DescendingIterator() {
		LinkedList <Integer> ll3 = new LinkedList(Arrays.asList(41,32,61,13));
		Iterator it1=ll3.descendingIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
	public void peekDemo() {
		LinkedList <Integer> ll4 = new LinkedList(Arrays.asList(10,25,16,45,30));
		System.out.print(ll4.peekFirst()+" ");
		System.out.print(ll4.peek()+" ");
		System.out.println(ll4.peekLast()+" ");
	}
	public LinkedList CloneTheList() {
		LinkedList <Integer> ll5 = new LinkedList(Arrays.asList(10,25,16,45,30));
		LinkedList <Integer> ll6 = (LinkedList<Integer>) ll5.clone();
		return ll6;
	}
	public LinkedList PollData() {
		LinkedList <Integer> ll5 = new LinkedList(Arrays.asList(10,25,16,45,30));
		ll5.poll();
		return ll5;
	}
	public LinkedList PollLastData() {
		LinkedList <Integer> ll6 = new LinkedList(Arrays.asList(10,25,16,45,30));
		ll6.pollLast();
		return ll6;
	}
	public LinkedList EmptyCheck() {
		LinkedList <Integer> ll7 = new LinkedList(Arrays.asList());
		if(ll7.isEmpty()) {
			ll7.add(19);
			ll7.add(99);
			ll7.add(9);
		}
		else {
			System.out.println(ll7);
		}
		return ll7;
	}
	public int elementDemo() {
		LinkedList <Integer> ll6 = new LinkedList(Arrays.asList(10,25,16,45,30));
		int ele=ll6.element();
		System.out.println(ll6);
		return ele;
	}
	public LinkedList SetMethodDemoList() {
		LinkedList <Integer> ll8 = new LinkedList(Arrays.asList(10,25,16,45,30));
		ll8.set(1, 24);
		return ll8;
	}
	public LinkedList TakeInput() {
		Scanner c = new Scanner(System.in);
		LinkedList <Integer> ll9 = new LinkedList();
		for(int i=0;i<5;i++) {
			ll9.add(c.nextInt());
		}
		return ll9;
	}
	public Object[] ConvertLinkedListToArray() {
		LinkedList <Integer> ll8 = new LinkedList(Arrays.asList(10,25,16,45,30));
		Object a[]=ll8.toArray();
		return a;
	}
	
}
