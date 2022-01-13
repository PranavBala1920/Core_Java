// Example of Default constructor
public class Constructor {

	String name;
	int number;

	void display() {
		System.out.println(name + "" + number);
	}

	public static void main(String[] args) {

		Constructor constructor = new Constructor();
		Constructor constructor2 = new Constructor();
		constructor.display();
		constructor2.display();
	}

}