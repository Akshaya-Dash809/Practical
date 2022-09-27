package Lab_29Sep;

//diplay default value
//display default consructor

public class Defaultcon {  
	int age;
	String name;
	void show() { //method to display age and name
		System.out.println(age + " " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//1st object for name and age
	Defaultcon d = new Defaultcon();
	
	//2nd object for name and age
	Defaultcon d1= new Defaultcon();
	d.show();
	d1.show();

	
	}

}
