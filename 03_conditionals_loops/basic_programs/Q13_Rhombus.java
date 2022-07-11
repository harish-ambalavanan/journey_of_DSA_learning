package basic_programs;

import java.util.Scanner;

public class Q13_Rhombus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Perimeter of Rhombus");
		System.out.print("Enter the value of side: ");
		double side = input.nextDouble();
		double perimeter = 4 * side;
		System.out.println("Perimeter of Rhombus: " + perimeter);
		input.close();
	}
}
