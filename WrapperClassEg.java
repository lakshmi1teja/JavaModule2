package newjavapackage;

public class WrapperClassEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperClassEg wce = new WrapperClassEg();
		double number = wce.convertIntoDouble("345.67");
		System.out.println(number);
		Object obj = number;
		System.out.println("value3 is of type: " + obj.getClass().getName());
		    }
	public double convertIntoDouble(String num) {
		double intinum = Double.parseDouble(num);
		return intinum;
	}

}
