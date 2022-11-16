package Lab_16_Nov;


import java.io.IOException;

public class ThrowEx1 {
void show()throws IOException{
	throw new IOException("throw exception");//checked
}
void display()throws IOException{
	show();
}
void fetch() {
	try {display();}
	catch(Exception e) {
		System.out.println("Exception solved");
	}}
public static void main(String[] args) /*throws IOException*/{
	ThrowEx1 obj=new ThrowEx1();
	obj.fetch();
	//obj.display();
	//obj.show();//if we call a method that declare an exception.then we must declare the exception
	System.out.println("The end");
}
}