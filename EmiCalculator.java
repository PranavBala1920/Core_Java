import java.util.*;
import java.util.Scanner;

public class EmiCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Loan Amount: ");
		double loanAmount = scanner.nextFloat();

		System.out.print("Enter Loan Interest rate: ");
		double interestRate = scanner.nextFloat();

		System.out.print("Enter Time in Year: ");
		double time = scanner.nextFloat();

		interestRate = interestRate / (12 * 100);
		time = time * 12;

		double emi = (loanAmount * interestRate * Math.pow(1 + interestRate, time)) / (Math.pow(1 + interestRate, time) - 1);
		System.out.print("Monthly EMI is= " + emi + "\n");
	}

}