package lab_10Oct;

public class Overloading1 {
//changing the no of arguments
	static int sum(int a,int b) {//two parameter
		return a+b;}
		static int sum(int a,int b,int c)	{//three arguments
		return a+b+c;
		}
		public static void main(String[]args) {
			System.out.println(Overloading1.sum(5,6));
			System.out.println(Overloading1.sum(5,6,8));
		}
}
