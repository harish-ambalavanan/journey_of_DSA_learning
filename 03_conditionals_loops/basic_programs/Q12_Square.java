package basic_programs;

import java.util.Scanner;

public class Q12_Square {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Perimeter of Square");
		System.out.print("Enter the value of side: ");
		double side = input.nextDouble();
		double perimeter = 4 * side;
		System.out.println("Perimeter of Square: " + perimeter);
		input.close();
	}
}
