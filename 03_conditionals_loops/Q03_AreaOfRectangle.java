package basic_programs;

import java.util.Scanner;

public class Q03_AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Area of Rectangle");
		System.out.print("Enter length: ");
		double length = input.nextDouble();
		System.out.println("Enter breadth");
		double breadth = input.nextDouble();
		double area = breadth * length;
		System.out.println("Area of rectangle: " + area);
		input.close();
	}

}
