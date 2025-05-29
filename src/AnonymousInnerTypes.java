abstract class Plane{
		void takeoff(){
			System.out.println("Plane TookOff");
		}
		void land() {
			System.out.println("Plane Landed");
		}
		abstract void fly();
}
class AnonymousInnerTypes {
	public static void main(String[] args) {
		Plane p=new Plane() {
			@Override
			void fly() {
				System.out.println("Plane Flew");
			}
		};
		p.takeoff();
		p.fly();
		p.land();
	}

}
