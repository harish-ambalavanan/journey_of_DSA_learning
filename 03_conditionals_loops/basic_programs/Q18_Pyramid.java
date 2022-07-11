package basic_programs;

import java.util.Scanner;

public class Q18_Pyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Volume of Pyramid");
		System.out.print("Enter base area: ");
		double base_area = input.nextDouble();
		System.out.print("Enter height: ");
		double height = input.nextDouble();
		double volume = (1 / 3) * base_area * height;
		System.out.print("Volume of Pyramid: " + volume);
		input.close();
	}
}
