package maventhirdpackage;

public class StaticExample3{
	public static void main(String[] args) {
		System.out.println(StaticExample.showId(111));
	}
}

class StaticExample {

	static int showId(int sId) {
		return sId;
	}
}
