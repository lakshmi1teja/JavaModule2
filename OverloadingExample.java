package newjavapackage;

public class OverloadingExample {
	public static void main(String[] args) {
		OverloadJava olj1 = new OverloadJava();
		String name = olj1.animename;
		int ep = olj1.noOfEpi;
		String hero = olj1.McName;
		System.out.println(name+" "+ep+" "+hero);
		OverloadJava olj2 = new OverloadJava("Bleach",366,"Ichigo");
		System.out.println(olj2.animename+" "+olj2.noOfEpi+" "+olj2.McName);
	}
}
class OverloadJava{
	String animename;
	int noOfEpi;
	String McName;
	OverloadJava(){
		animename="JJK";
		noOfEpi=20;
		McName="Yuji";
		
	}
	OverloadJava(String an,int epi,String mc){
		this.animename=an;
		this.noOfEpi=epi;
		this.McName=mc;
	}
}
