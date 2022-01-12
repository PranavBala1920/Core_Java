import java.util.*;

public class WhileLoop {

	public static void main(String[] args) {
		int number = 1;

	while (number <= 100) {

		System.out.println(number);

	if (number % 10 == 0) {
		
		System.out.println("number 10 is found ");
		break;
	}
		number++;
	}

	System.out.print("program end");

	}
	
}