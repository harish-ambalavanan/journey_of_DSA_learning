package basic_programs;

import java.util.Scanner;

public class Q10_Parallelogram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Perimeter of Parallelogram ");
		System.out.print("Enter base: ");
		double base = input.nextDouble();
		System.out.print("Ente side: ");
		double side = input.nextDouble();
		double perimeter = 2 * (base + side);
		System.out.println("Perimeter of Parallelogram: " + perimeter);
		input.close();
	}
}
