package Lab_13Oct;

//Create object without new keyword
class WithoutNew { //one class and its data members

	String name;
	int id;
}

public class AnotherClass{
	public static void main(String[] args) {
		try {
			//Creating objects using new instance members
			WithoutNew o1=WithoutNew.class.newInstance();
			WithoutNew o2=WithoutNew.class.newInstance();
			WithoutNew o3=WithoutNew.class.newInstance();
			WithoutNew o4=WithoutNew.class.newInstance();
			WithoutNew o5=WithoutNew.class.newInstance();
			
			//initializing data members of objects
			o1.name="a";
			o1.id=101;
			
			o2.name="b";
			o2.id=102;
			
			o3.name="c";
			o3.id=103;
			
			o4.name="d";
			o4.id=104;
			
			o5.name="e";
			o5.id=105;
			
			//printing statement
			System.out.println("name= "+o1.name+" "+"id= "+o1.id);
			System.out.println("name= "+o2.name+" "+"id= "+o2.id);
			System.out.println("name= "+o3.name+" "+"id= "+o3.id);
			System.out.println("name= "+o4.name+" "+"id= "+o4.id);
			System.out.println("name= "+o5.name+" "+"id= "+o5.id);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}