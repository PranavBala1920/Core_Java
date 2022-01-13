public class ConstructorOverloading {

	private String name;
	private boolean flag;

	ConstructorOverloading() {
		name = "Defalut Constructor";
		System.out.println(name);
	}

	ConstructorOverloading(String name, boolean flag) {
		this.name = name;
		this.flag = flag;
	}

	void getname() {
		System.out.println("Name and Number is: " + name + flag);
	}

	public static void main(String[] args) {
		ConstructorOverloading overloading = new ConstructorOverloading();
		ConstructorOverloading overloading1 = new ConstructorOverloading("pranav", true);
		overloading1.getname();
	}
	
}