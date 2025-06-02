abstract class Train{
	void start() {
		System.out.println("Train is starting");
	}
	abstract void signal();
	abstract void move();
}
class Train2 extends Train{
	@Override
	void signal() {
		System.out.println("The signal is Green");
	}
	@Override
	void move() {
		System.out.println("Train is moving");
	}
	void stop() {
		System.out.println("The signal is red."+"\n"+"The train has stopped.");
	}
}
class AbstractExample1 {
	public static void main(String[] args) {
		Train2 T=new Train2();
		T.start();
		T.signal();
		T.move();
		T.stop();
	}
}
