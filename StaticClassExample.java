class StaticClassExample {

	public static String strting = "Static Example in java";

	public static class NestedClass {

		void main() {
			println(strting);
		}
	}

	public static void main(String[] args) {
		StaticClassExample.NestedClass staticClass = new StaticClassExample.NestedClass();
		staticClass.main();
	}

}