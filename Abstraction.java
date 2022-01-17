abstract class Bike {

	Bike() {
		System.out.println("Constructor is Calling");
	}

	abstract void run();

	void topSpeed() {
		System.out.println("Speed is 120kmpl");
	}
}

class Hero extends Bike {

	void run() {
		System.out.println("Bike is Running!");
	}
}

class Abstraction {
	
	public static void main(String[] args) {
		Bike bike = new Hero(); // upcasting
		bike.run();
		bike.topSpeed();
	}

}