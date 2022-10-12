package Lab_12Oct;

//Static binding
/*public class Binding {
	private void display() {  //Static Binding
		System.out.println("samjhe");
	}
public static void main(String[] args) {
	Binding obj=new Binding();
	obj.display();
	
	
}
}*/
//Dynamic binding
class TestBinding {
	void show() {  //Dyanamic biniding
		System.out.println("ab samjhe");
	}
}

class Binding extends TestBinding {
	void show() {
		System.out.println("Override"); //runtime
	}

	public static void main(String[] args) {
		Binding obj = new Binding();
		obj.show();

	}
}