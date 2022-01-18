public class SimpleArray {

	static void arrays() {
		int values[] = new int[5];
			values[0] = 10;
			values[1] = 10;
			values[2] = 10;
			values[3] = 10;
			values[4] = 10;

		for (int i = 0; i < values.length; i++) {
			System.out.println("Print :- " + values[i]);
		}

	}

	public static void main(String[] args) {
		arrays();
	}

}