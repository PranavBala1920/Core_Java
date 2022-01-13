public class ConstructorOverloading {

	private String name;
	private boolean bool;

	ConstructorOverloading() {
		name = "Defalut Constructor";
		System.out.println(name);
	}

	ConstructorOverloading(String Name, boolean bool2) {
		this.name = Name;
		this.bool = bool2;
	}

	void getname() {
		System.out.println("Name and number is: " + name + bool);
	}

	public static void main(String[] args) {

		ConstructorOverloading overloading = new ConstructorOverloading();
		ConstructorOverloading overloading1 = new ConstructorOverloading("pranav", true);
		overloading1.getname();
	}
	
}