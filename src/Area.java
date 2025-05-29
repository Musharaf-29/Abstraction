import java.util.*;
abstract class Shapes{
	double area;
	abstract void CollectData();
	abstract void CalculateData();
	void display() {
		System.out.format("Area:%.2f",area);
		System.out.println();
	}
}
class Square extends Shapes{
	Scanner sc=new Scanner(System.in);
	double s=0.0d;
	@Override
	void CollectData() {
		System.out.println("Enter the side(s) value:");
		s=sc.nextDouble();
	}
	@Override
	void CalculateData() {
		area=s*s;
	}
}
class Circle extends Shapes{
	Scanner sc=new Scanner(System.in);
	double r=0.0d;
	static final double pi=3.147;
	@Override
	void CollectData() {
		System.out.println("Enter the radius:");
		r=sc.nextDouble();
	}
	@Override
	void CalculateData() {
		area=pi*r*r;
	}
}
class Triangle extends Shapes{
	Scanner sc=new Scanner(System.in);
	double length;
	double breadth;
	@Override
	void CollectData() {
		System.out.println("Enter the length and Breadth:");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
	}
	@Override
	void CalculateData() {
		area=0.5*length*breadth;
	}
}
class Area {
	public static void main(String[] args) {
		Square sq=new Square();
		sq.CollectData();
		sq.CalculateData();
		sq.display();
		Circle c=new Circle();
		c.CollectData();
		c.CalculateData();
		c.display();
		Triangle t=new Triangle();
		t.CollectData();
		t.CalculateData();
		t.display();
		
	}
}
