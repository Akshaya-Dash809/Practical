package lab_10Oct;

public class StudentDetails {

	int id;
	String name;
	StudentAdd address;//reference entity
public StudentDetails(int id,String name,StudentAdd address) {
	this.id=id;
	this.name=name;
	this.address=address;
}
void show() {
	System.out.println(id+" "+name);
	System.out.println(address.area+" "+address.city+" "+address.dist);
}
public static void main(String[] args) {
	StudentAdd a1=new StudentAdd("Odisha","Rourkela","Sundergarh");
	StudentDetails d1=new StudentDetails(101,"Akshaya",a1);
	d1.show();
}
}

