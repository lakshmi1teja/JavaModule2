package interfacesandmultipleinhe;

public interface Author {

	abstract String authorNameDetails();
	abstract int authorIdDetails();
	abstract double authorRemunerationDetails();
	abstract int authorExpDetails();
	static int test1(int p) {
		return p;
	}
	default void test2(){
		System.out.println("It is test2");
	}
}
