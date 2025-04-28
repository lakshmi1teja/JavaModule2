package mavenseconpackage;

import mavenpackagepractice.InheritancePractice;

public class ATM extends InheritancePractice{
	 public ATM(String BankName,String BankIFSC,String BankLoc){
		 super(BankName,BankIFSC,BankLoc);
	 }
	 public void InvokeMethod() {
		 super.DisplayBankDetails();
	 }
	 public void derivedMethod() {
		 System.out.println("Singam-123");
	 }
}
