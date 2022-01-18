interface Multiply {

	void draw();

	static int cube(int x) {
		return x * x * x;
	}

}

class One implements Multiply {

	public void draw() {
		System.out.println("Value is Here: ");
	}

}

class InterfaceTwo {

	public static void main(String[] args) {
		Multiply multiply = new One();
		multiply.draw();
		System.out.println(Multiply.cube(25));
	}

}