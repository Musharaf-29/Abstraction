abstract class Plane1{
	void takeOff(){
		System.out.println("Plane TookOff");
	}
	abstract void fly();
	void land() {
		System.out.println("Plane Landed");
	}
	
}
class CargoPlane extends Plane1{
	@Override
	void fly() {
		System.out.println("CargoPlane Flew");
	}
}
public class AbstractExample {
	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
	}

}
