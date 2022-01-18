interface Shapes {

	void main(); //interface methods cannot have body {}
}

class Circle implements Shaps {

	void main() {
		System.out.println("Draw Circle...");
	}

}

class Rectangle implements Shapes {

	void main() {
		System.out.println("Draw Rectangle...");
	}

}

public class Interface {

	public static void main(String args[]) {
		Shapes shapes = new Rectangle();
		shapes.main();
	}

}