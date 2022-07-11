package intermediate_programs;

import java.util.Scanner;

public class Q01_Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to find the factorial of it: ");
		int number = input.nextInt(); ;
		int product = 1;
		for (int i = number; i >= 2; i--) {
			product *= i;
		}
		input.close();
		System.out.println("Factorial of " + number + ": " + product);
	}
}
