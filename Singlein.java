package Lab_29Sep;

//Single Inheritance
class vehicle{//parent class A
	void running() {
		System.out.println("running mode is on");
	}
}
	class bike extends vehicle{//child class b
		void run() {
			System.out.println("Bike run mode on");
		}
	}

public class Singlein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b1=new bike();//object of child class
		b1.run();//child class method
		b1.running();//parent class
	}

}
