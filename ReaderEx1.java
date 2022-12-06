package Lab_03_Dec;
import java.io.*;
public class ReaderEx1 { //main class
 public static void main(String[] args) { //main method
	try {
		FileReader fr=new FileReader("E:\\Test1.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.println((char)i);
		}
		fr.close();
		System.out.println("Done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
}
}
