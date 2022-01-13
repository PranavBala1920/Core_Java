public class WrapperClass {
	
	public static void main(String[] args) {
		int value = 5;
		Integer integer = Integer.valueOf(value);
		Integer intergerTwo = value;

		if (value == intergerTwo) {
			System.out.println("Value is same");
		}
		System.out.println(value + " , " + integer + " , " + intergerTwo);
	}

}