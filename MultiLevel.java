class Car {

	int price = 10;
	int interest = 20;
}

class HondaCity extends Car {

	int value = 100;

	void main() {
		int carPrice = price + interest;
		System.out.println("Total Car Price is :- " + carPrice);
	}
}

class Audi extends HondaCity {

	void showValue() {
		System.out.println("Valuation of Car :- " + value);
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		HondaCity hondaCity = new HondaCity();
		Audi audi = new Audi();
		hondaCity.main();
		audi.showValue();
	}

}