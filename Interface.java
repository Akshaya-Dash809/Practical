package Lab_18Oct;

interface Test1 { //interface
 void show();  //method of interface
}

class Interface1 implements Test1{
	public void show() {
		System.out.println("Hello my future employees");
	}
}
	
	class Interface implements Test1{
		public void show() {
			System.out.println("Welcome to the company ");
		}
	
	public static void main(String[] args) {
	//	Interface1 obj = new Interface1();
	//	obj.show();
		
		Test1 ob =  new Interface();
		ob.show();
	}
}

