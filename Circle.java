package lab_10Oct;

//Aggregation Has-A relationship
//we have created the reference entity of aggregation
class Aggregation{//class 1
	int Square(int r) {
		return r*r;
	}
}
public class Circle {//class 2
	Aggregation ag;//obj(entity ref)
	double pi=3.14;
	double area(int radius)
	{
	ag=new Aggregation();
	int psquare=ag.Square(radius);
	return pi*psquare;
	
	}
public static void main(String[] args) {
	Circle c=new Circle();
	double result=c.area(5);//5*5*3.14
	System.out.println("The Area is : "+result);
}
}