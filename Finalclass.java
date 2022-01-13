class Car {

	int speed = 120;
}

class Bike extends Car {

	void speedTest() {
		System.out.println("Bike speed " + super.speed);
	}
}

public class FinalClass {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.speedTest();
	}
	
}