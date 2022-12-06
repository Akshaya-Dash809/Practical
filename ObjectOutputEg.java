package Lab_03_Dec;
import java.io.*;
//Writing state of an object into byte-stream -SERIALIZATION
class Student implements Serializable{
	transient int id;
	String name;
	int fees;
  Student(int id,String name,int fees){
	  this.id=id;
	  this.name=name;
	  this.fees=fees;
  }
}

public class ObjectOutputEg {
   public static void main(String[] args) {
	try {
		Student s=new Student(101,"AKD",2000);
		FileOutputStream os =new FileOutputStream("E:\\test1.txt");
	    ObjectOutputStream op =new ObjectOutputStream(os);
	    op.writeObject(s);
	    op.close();
	    System.out.println("Done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
