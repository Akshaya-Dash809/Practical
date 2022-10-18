//Multiple inheritance in interface

package Lab_18Oct;

interface MultipleIn1 { //1st parent interface

	void show();
}

interface MultipleIn2{ //2nd parent interface,1st child class
	void display();
}

class MultipleIn implements MultipleIn1,MultipleIn2{ //2nd child class
	public void show() {
		System.out.println("Hii");
	}
	public void display() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		MultipleIn  obj = new MultipleIn();
		obj.show();
		 obj.display();
	}
}