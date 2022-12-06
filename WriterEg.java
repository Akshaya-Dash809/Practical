package Lab_03_Dec;
import java.io.*;
public class WriterEg { //main class
 public static void main(String[] args) { //main method
	try {
		FileWriter fw=new FileWriter("E:\\Test2.txt");//write
		fw.write("Coding");//print in file
		
		fw.close();
		System.out.println("\nDone");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
}
}
