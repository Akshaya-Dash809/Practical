package Lab_17Oct;

public class VarArgs {

	static void show(String...text) {
System.out.println("Show method invoked");
for(String s:text) {
	System.out.println(s);
}
}
	public static void main(String[] args) {
		show();//zero arguments
		show("Hi");//one args
		show("I","love","Coding");//three args
		
	}
}

