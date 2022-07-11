package basic_programs;

import java.util.Scanner;

public class Q17_Sphere {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Volume of Sphere");
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		double volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
		System.out.println("Volume of Sphere: " + volume);
		input.close();
	}
}
