package Lab_09_N0v;
import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String str1,str2;
				Scanner ab=new Scanner(System.in);
				System.out.println("Enter first String");
				str1=ab.nextLine();
				System.out.println("Enter first String");
				str2=ab.nextLine();
				if(str1.equals(str2)) {
					System.out.println("The strings are equal");
				}
				else
						System.out.println("not equal");
				}
}

