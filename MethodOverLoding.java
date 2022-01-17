class Helper {

	static int Multiply(int a, int b) {
		return a * b;
	}

	static double Multiply(double a, double b) {
		return a * b;
	}
	
}

public class MethodOverLoding {

	public static void main(String[] args) {
		System.out.println(Helper.Multiply(5, 11));
		System.out.println(Helper.Multiply(6.5, 6.3));
	}

}