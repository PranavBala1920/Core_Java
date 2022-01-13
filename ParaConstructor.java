public class ParaConstructor {

	private String name;
	private int number;

	ParaConstructor(String nameN, int numberN) {
		this.name = nameN;
		this.number = numberN;
	}

	void display() {
		System.out.println(name + "" + number);
	}

	public static void main(String[] args) {

		ParaConstructor paraConstructor = new ParaConstructor("pranav", 87);
		paraConstructor.display();
	}
	
}