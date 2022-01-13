import java.util.*;

public class IfElse {

	public static void main(String[] args) {
		int age = 18;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your age- ");
		int enterAge = sc.nextInt();

		if (enterAge >= age) {
			System.out.print("Congratuation you are eligible for Driving licence");
		} else {
			System.out.print("Sorry you are UnderAge");
		}
	}

}