package mavenseconpackage;

public class TestChild1 extends TestParent{
	public void displayInfo1() {
		TestChild1 tc = new TestChild1();
		System.out.println(tc.path);
		System.out.println(tc.browser);
		System.out.println(tc.animename);
	}
}
