package basic_programs;

import java.util.Scanner;

public class Q04_AreaOfIsoscelesTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Area of Isosceless Triangle");
		System.out.print("Enter the base: ");
		double base = input.nextDouble();
		System.out.print("Enter the height: ");
		double height = input.nextDouble();
		
		double area = (0.5) * base * height;
		System.out.println("Area of isosceless triangle is "+area);
		input.close();
	}

}
