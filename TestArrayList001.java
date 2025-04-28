package collectionsdemo;

import java.util.Arrays;

public class TestArrayList001 {

	public static void main(String[] args) {
		Lib_ArrayList obj = new Lib_ArrayList();
		obj.CreateAnArray();
		System.out.println(obj.CreatAnArrayListTest());
		System.out.println(obj.TakeIp());
		obj.JoinTwoArrayList();
		System.out.println(obj.JoinTwoArrayListTest());
		System.out.println(obj.JoinTwoArrayListTest());
		System.out.println(obj.TakeDateFromArraytoArrayList());
		obj.ArrayListTraversalOne();
		obj.ArrayListTraveraltwo();
		System.out.println(obj.RandomDataAccessFromArrayLists());
		System.out.println(obj.InsertDataInList());
		System.out.println(obj.UpdateList());
		System.out.println(obj.DeleteList());
		System.out.println(obj.ValidateList());
		System.out.println((obj.ConvertDataToArray()));
		System.out.println(obj.SortList());
		System.out.println(obj.SearchList());
	}

}
