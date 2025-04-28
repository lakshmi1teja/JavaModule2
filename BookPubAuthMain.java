package callthemethodsauthorbook;

import interface2package.BookClassOne;
import interfacesandmultipleinhe.Author;

public class BookPubAuthMain extends BookClassOne{
	public static void main(String[] args) {
	BookPubAuthMain bpam = new BookPubAuthMain();
	String pnm = bpam.publisherNameDetails();
	int pid=bpam.publisherIdDetails();
	String pod = bpam.publisherOwnerDetails();
	int pexp = bpam.publisherExperienceDetails();

	//author
	String an = bpam.authorNameDetails();
	int aid = bpam.authorIdDetails();
	double arem = bpam.authorRemunerationDetails();
	int aexp=bpam.authorExpDetails();
	System.out.println(pnm+" "+pid+" "+pod+" "+pexp);
	System.out.println(an+" "+aid+" "+arem+" "+aexp);
	Author.test1(5);
	bpam.test2();
	}
}
