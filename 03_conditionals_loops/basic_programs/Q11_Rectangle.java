package basic_programs;

import java.util.Scanner;

public class Q11_Rectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Perimeter of Rectangle ");
		System.out.print("Enter length: ");
		double length = input.nextDouble();
		System.out.print("Enter width: ");
		double width = input.nextDouble();
		double perimeter = 2 * (length + width);
		System.out.println("Perimeter of Parallelogram: " + perimeter);
		input.close();
	}
}
