package basic_programs;

import java.util.Scanner;

public class Q20_TotalSurfaceAreaOfCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Total surface area of cube");
		System.out.print("Enter the value of side: ");
		double side = input.nextDouble();
		double area = 6 * (side * side);
		System.out.println("Total surface area of cube: " + area);
		input.close();
	}

}
