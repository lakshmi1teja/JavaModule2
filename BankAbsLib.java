package javaPracticeDay10;




public class BankAbsLib extends BankAbsTemplet1 {


	void bankName(String bankNm) {
		
		
		System.out.println(bankNm);
	}


	String bankCeoName(String bankCeoname) {
		
		return bankCeoname;
	}

	String bankAdress(String bnkaddr) {
		
		return bnkaddr;
	}

	
	String bankIFSCCode(String ifsc) {
		
		return ifsc;
	}

	
	double bankTurnOverPerYear(double turnover) {
		
		return turnover;
	}

}
