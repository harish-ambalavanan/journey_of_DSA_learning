package basic_programs;

import java.util.Scanner;

public class Q26_AdditionOfTwoNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int number1 = input.nextInt();
		System.out.print("Enter number2: ");
		int number2 = input.nextInt();
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
	}
}
