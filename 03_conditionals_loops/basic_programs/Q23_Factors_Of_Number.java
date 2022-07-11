package basic_programs;

import java.util.Scanner;

public class Q23_Factors_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:" );
		int number = input.nextInt();
		System.out.print(1);
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				System.out.print(" " + i);
		}
		System.out.print(" " + number);
		input.close();
	}

}
