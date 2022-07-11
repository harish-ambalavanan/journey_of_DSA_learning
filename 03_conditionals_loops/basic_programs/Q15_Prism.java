package basic_programs;

import java.util.Scanner;

public class Q15_Prism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Volume of prism");
		System.out.print("Enter area of base: ");
		double base = input.nextDouble();
		System.out.println("Enter height");
		double height = input.nextDouble();
		double area = height * base;
		System.out.println("Volume of Prism: " + area);
		input.close();
	}

}
