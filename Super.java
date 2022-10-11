package Lab_11Oct;

//Super keyword: Reference variable which refer immediate parent class
//# usage of SUPER keyword
//1st_Refer immediate parent class instance variable

class Shape{
	String name="circle";
}
class Size extends Shape{
	String name="Triangle";
	void print() {
		System.out.println(name);
		System.out.println(super.name); //this is the parent class name variable

	}}
public class Super {

	public static void main(String[] args) {
    Size s=new Size();
    s.print();
	}
	}