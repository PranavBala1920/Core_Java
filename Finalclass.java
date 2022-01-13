class Car {

	int speed = 120;
}

class Bike extends Car {

	void speedtest() {
		System.out.println("Bike speed " + super.speed);
	}
}

public class Finalclass {

	public static void main(String[] args) {

		Bike bike = new Bike();
		bike.speedtest();
	}
	
}