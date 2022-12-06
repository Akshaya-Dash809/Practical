package Lab_03_Dec;
import java.io.*;
// Object inputstrean - Deserialization
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

public class ObjectInputEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		 ObjectInputStream op =new ObjectInputStream(new FileInputStream("E:\\test1.txt"));
        Student s=(Student)op.readObject();
        System.out.println(s.id+" "+s.name+" "+s.fees);
        op.close();
	    System.out.println("Done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
		

}
