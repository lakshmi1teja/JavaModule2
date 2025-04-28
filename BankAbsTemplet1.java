package javaPracticeDay10;

abstract public class BankAbsTemplet1 {
	abstract void bankName(String bankNm);
	abstract String bankCeoName(String bankCeoname);
	abstract String bankAdress(String bnkaddr);
	abstract String bankIFSCCode(String ifsc);
	abstract double bankTurnOverPerYear(double turnover);
	void testMethod() {
		String statement = "Hey";
		System.out.print(statement);
	}
	String modelName(String mnm) {
		return mnm;
	}
	
}
