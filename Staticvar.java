package Lab_28Sep;

public class Staticvar {//class 1
	int roll_no;
	String name;
	float fees;
	static String college="P J college";
	//constructor
	Staticvar(int roll_no,String name,float fees){
		this.roll_no=roll_no;
		this.name=name;
		this.fees=fees;
	}
	//method
	void display() {
		System.out.println(roll_no+" "+name+" "+fees+" "+college);
		
	}
	
		public static void main(String[] args) {
			Staticvar s1=new Staticvar(11,"Akd",55000);
			Staticvar s2=new Staticvar(12,"Skd",55000);
			s1.display();
			s2.display();
			
		}
	}
