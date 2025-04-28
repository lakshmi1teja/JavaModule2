package mavenpackagepractice;

public class InheritancePractice {
	String BankName;
	String BankIFSC;
	String BankLoc;
	protected InheritancePractice(String BankName,String BankIFSC,String BankLoc){
		this.BankName=BankName;
		this.BankIFSC=BankIFSC;
		this.BankLoc=BankLoc;
	}
	public void DisplayBankDetails() {
		System.out.println(BankName+ " " +BankIFSC+ " " +BankLoc);
	}
}
