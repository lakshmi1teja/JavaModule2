package maventhirdpackage;

import mavenseconpackage.ATM;

public class RunBankClasses{
	public static void main(String args[]) {
		ATM atm = new ATM("Axis","UNIB234567","BBS-1");
		atm.derivedMethod();
		atm.DisplayBankDetails();
	}
}
