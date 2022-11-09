package Lab_09_Nov;
//Represent any object toString,we can return value of an object instade of hascode
public class ToString {

	int rollno;
	String name,address;
	ToString(int rollno,String name,String address){
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
	public String toString() { //return object into string
		return rollno+" "+name+" "+address;
	}
	public static void main(String[] args) {
		ToString S1= new ToString(101,"Aks","Ods");
		ToString S2= new ToString(101,"Ppd","Ods");
		System.out.println(S1);
		System.out.println(S2);
	}
}
