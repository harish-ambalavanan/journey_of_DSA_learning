package basic_programs;

import java.util.Scanner;

public class Q16_Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Volume of Cylinder");
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		System.out.print("Enter height: ");
		double height = input.nextDouble();
		double volume = Math.PI * Math.pow(radius, 2) * height; // pi * r^2 * h
		System.out.println("Volume of Cylinder: " + volume);
		input.close();
	}

}
