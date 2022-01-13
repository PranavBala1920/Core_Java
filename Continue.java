public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("Ignore this and Continue" + "" + i);
				continue;
			}
			System.out.println(i);
			System.out.println("Go to next");
		}
	}

}