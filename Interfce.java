package Lab_18Oct;

interface MultipleIn3{ //1st parent interface

	void show();
}

interface MultipleIn4{ //2nd parent interface,1st child class
	void show();
}

class Interfce implements MultipleIn3,MultipleIn4{ //2nd child class
	public void show() {
		System.out.println("Hii");
	}
	public static void main(String[] args) {
		MultipleIn  obj = new MultipleIn();
		obj.show();
	}
}