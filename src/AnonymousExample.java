abstract class Example{
	void run() {
		System.out.println("Running");
	}
	abstract void sleep();
	abstract void work();
}
class AnonymousExample {
	public static void main(String[] args) {
		Example e=new Example() {
		@Override
		void sleep() {
			System.out.println("Sleeping");
		}
		@Override
		void work() {
			System.out.println("Working");
		}
	};
	e.run();
	e.sleep();
	e.work();
}
}
