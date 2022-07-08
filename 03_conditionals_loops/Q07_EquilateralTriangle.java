package basic_programs;

import java.util.Scanner;

public class Q07_EquilateralTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Area of Equilateral Triangle");
		System.out.println("Enter the value of side:");
		double a = input.nextDouble();
		double area = (Math.sqrt(3) / 4) * (a * a);
		System.out.println("Area of Equilateral Triangle: " + area);
		input.close();
	}
}
