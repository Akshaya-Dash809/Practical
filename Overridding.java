package lab_10Oct;

class Test{
	void run() {
		System.out.println("running mode on");
	}
}

//creating child class
class Overridding extends Test {

	void run() {
		System.out.println("running mode off");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating a object of child class
		Overridding a=new Overridding();
		a.run();
		//creating parent class object
		Test t = new Test();
		t.run();
	}

}
