package lab_10Oct;

public class Overloading2 {
//changing the datatypes of arguments
	static int sum(int a,int b) { //integer type arguments
		return a+b;
	}
	static double sum(double a,double b) { //double type arguments
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(Overloading2.sum(5, 6));
		System.out.println(Overloading2.sum(5.6, 6.6));
	}
}
