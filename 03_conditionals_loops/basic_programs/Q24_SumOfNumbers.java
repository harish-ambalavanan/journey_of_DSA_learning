package basic_programs;

import java.util.Scanner;

public class Q24_SumOfNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers to do sum of the numbers and Enter 0 to get the sum");
		// System.out.println("Enter 0 to quit");
		int number;
		int sum = 0;

		while (true) {
			number = input.nextInt();
			sum = sum + number;
			if (number == 0)
				break;
		}
		System.out.print("Sum of entered numbers: " + sum);
		input.close();
	}
}
