package Lab_09_N0v;

import java.util.Scanner;

public class StringTest {
	String x="Hello";
	public void show() {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String A=sc.next();
		String B=sc.next();
		System.out.println(A.length()+B.length());
		System.out.println((A.compareTo(B)>0)?"Yes":"No");
		System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" "
				+B.substring(0, 1).toLowerCase()+B.substring(1));*/
 System.out.println("Substring is:"+x.substring(0,3));
 System.out.println("Substring is:"+x.substring(2));
}
	public static void main(String[] args) { //main method
		StringTest t=new StringTest(); //creating object
		t.show(); //calling the method
	}
		
	}
