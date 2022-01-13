public class StringMethods {

	void charAt() {
		System.out.println("String charAt Example");
		String charvalue = "Java is object orianted";
		for (int i = 0; i <= charvalue.length() - 1; i++) {
			if (i % 2 != 0) {
				System.out.println("String odd value is" + i + "Value " + charvalue.charAt(i));
			}
		}
	}

	void concate() {
		System.out.println("String Concate Example");
		String str = "Country";
		String s = "India is my ".concat(str);
		System.out.println(s);
	}

	void equal() {
		System.out.println("String equal Example");
		String s1 = "javaisoop";
		String s2 = "javaisoop";
		String s3 = "Javaisoop";
		System.out.println(s1.equals(s2)); // True because content is same    
		if (s1.equals(s3)) {
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both strings are unequal");
		}
	}

	public static void main(String[] args) {
		StringMethods stringmethods = new StringMethods();
		stringmethods.charAt();
		stringmethods.concate();
		stringmethods.equal();
	}

}