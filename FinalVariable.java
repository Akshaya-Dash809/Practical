package Lab_11Oct;

//Final keyword cannot change the value of final variable(NEVER)
//Final variable ,Final method.Final class
public class FinalVariable {
final int value=50;
//final int value =60;  //It will give CE due to final variable can't change
void display() {
	System.out.println(value);	
}
	public static void main(String[] args) {
		FinalVariable obj=new FinalVariable();
		obj.display();
	}

}