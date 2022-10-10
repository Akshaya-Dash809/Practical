package lab_10Oct;

public class TypePromotion { //class
	void add(int a,long b) { //method 1
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {  //method 2
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypePromotion obj=new TypePromotion();
		obj.add(2,3); //2nd int will promoted to long
		obj.add(10,20,30);
	}

}
