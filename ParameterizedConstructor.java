public class ParameterizedConstructor {

	private String name;
	private int number;

	ParameterizedConstructor(String name, int number) {
		this.name = name;
		this.number = number;
	}

	void display() {
		System.out.println(name + "" + number);
	}

	public static void main(String[] args) {
		ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor("pranav", 87);
		parameterizedConstructor.display();
	}
	
}