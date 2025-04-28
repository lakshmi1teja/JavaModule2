package javaPracticeDay10;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		BankAbsLib bal = new BankAbsLib();
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the bank name:");
		String bankname=c.nextLine();
		
		System.out.println("Enter bank CEO name:");
		String bankceoname = c.nextLine();
		
		System.out.println("Enter bank adress:");
		String bankaddr = c.nextLine();
		
		System.out.println("Enter banks IFSC:");
		String Ifsc = c.nextLine();
	
		System.out.println("Enter bank turnover:");
		double Turnover = c.nextDouble();
		bal.bankName(bankname);
		System.out.println(bal.bankCeoName(bankceoname));
		System.out.println(bal.bankAdress(bankaddr));
		System.out.println(bal.bankIFSCCode(Ifsc));
		System.out.println(bal.bankTurnOverPerYear(Turnover));
		bal.testMethod();
		System.out.print(bal.modelName(" I'm a Star!"));
		
	}

}
