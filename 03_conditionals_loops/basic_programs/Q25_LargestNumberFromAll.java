package basic_programs;

import java.util.Scanner;

public class Q25_LargestNumberFromAll {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers to find the largest from all and enter 0 to stop and get result:");
		int number;
		int maximum = 0;
		while (true) {
			number = input.nextInt();
			maximum = number > maximum ? number : maximum;
			if (number == 0)
				break;
		}
		System.out.println("Largest number from given numbers: " + maximum);
		input.close();
	}
}
