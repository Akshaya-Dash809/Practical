/*
 * 5. Write a Java program to read first 3 lines from a file.
 */

package Lab_03_Dec;
import java.io.*; //BufferReader,FileInputStream,FileNotFoundException,IOException,InputStreamReader
public class ReadLine { //class
 public static void main(String[] args) { //main method
	BufferedReader b=null; //buffer class
	String s=" "; //blank string
	try {
		LineNumberReader l=new LineNumberReader(new InputStreamReader(new FileInputStream("E:\\test1.txt")));
	    while(((s=l.readLine())!=null) && l.getLineNumber()<=3){ //check the condition
	    	System.out.println(s);
	    }
	    l.close();
	}
	catch(FileNotFoundException e) {//file not found exception
		System.err.println("File not found");
	}
	catch(IOException ae) { //input output exception
		System.err.println("Unable to read file");
	}
}
}
