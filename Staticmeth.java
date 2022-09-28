package Lab_28Sep;

public class Staticmeth {//class 1
	int roll_no;
	String name;
	float fees;
	static String college="P J college";
	static void change() {//static method-we use this to change or modify anything
		college="ABC college";
	}
	
	//constructor
	Staticmeth(int roll_no,String name,float fees){
		this.roll_no=roll_no;
		this.name=name;
		this.fees=fees;
	}
	//method
	void display() {
		System.out.println(roll_no+" "+name+" "+fees+" "+college);
		
	}
	
		public static void main(String[] args) {
			Staticmeth.change();//no need to create object of static method.just write class name.method name()
			//creating object
			Staticmeth s1=new Staticmeth(11,"Akd",55000);
			Staticmeth s2=new Staticmeth(12,"Skd",55000);
			s1.display();
			s2.display();
			
		}
	}
