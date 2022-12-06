package Lab_03_Dec;
import java.io.*;
public class ConsoleEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	
	   Console c= System.console();
      System.out.println("Please enter your name");
      String s=c.readLine();
      System.out.println("Welcome"+s);
      System.out.println("Please enter your password");
      char[] ch=c.readPassword();
      String s1=String.valueOf(ch);
      System.out.println("Your password is "+s1);
	}

}
