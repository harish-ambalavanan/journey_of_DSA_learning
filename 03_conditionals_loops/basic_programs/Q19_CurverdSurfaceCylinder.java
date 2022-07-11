package basic_programs;

import java.util.Scanner;

public class Q19_CurverdSurfaceCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Area of curved surface cylinder");
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		System.out.print("Enter height: ");
		double height = input.nextDouble();
		double area = 2 * Math.PI * radius * height;
		input.close();
		System.out.print("Area of Curved Surface Cylinder: " + area);
	}

}
