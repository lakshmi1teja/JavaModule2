package collectionsdemo;

public class MainLinkedList {

	public static void main(String[] args) {
		LinkedListDemo lld = new LinkedListDemo() ;
		System.out.println(lld.ThisIsALinkedList());
		System.out.println(lld.LoadDataInLinkedList());
		System.out.println(lld.AddFirstDemo());
		System.out.println(lld.AddTwoLists());
		lld.TraverseList();
		lld.DescendingIterator();
		lld.peekDemo();
		System.out.println(lld.CloneTheList());
		System.out.println(lld.PollData());
		System.out.println(lld.PollLastData());
		System.out.println(lld.EmptyCheck());
		System.out.println(lld.elementDemo());
		System.out.println(lld.SetMethodDemoList());
		System.out.println(lld.TakeInput());
		Object[] r = lld.ConvertLinkedListToArray();
		for(Object x:r) {
			System.out.println(x);
		}
	}

}
