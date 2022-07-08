package basic_programs;

import java.util.Scanner;

public class Q01_AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius to calculate area of circle: ");
		double radius = input.nextDouble();
		// float pi = 3.14f;
		double piDefault = Math.PI;
		double areaOfCircle = piDefault * radius * radius;
		System.out.println("Area of circle is " + areaOfCircle);
		input.close();
	}

}
