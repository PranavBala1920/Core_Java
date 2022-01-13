class StaticClassExample {

	public static String str = "Static Example in java";

	public static class NestedClass {

		void main() {
			println(str);
		}
	}

	public static void main(String[] args) {

		StaticClassExample.NestedClass staticClass = new StaticClassExample.NestedClass();
		staticClass.main();
	}

}