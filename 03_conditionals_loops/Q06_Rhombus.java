package basic_programs;

import java.util.Scanner;

public class Q06_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Area of Rhombus");
		System.out.print("Enter the diagonal1: ");
		double diagonal_1 = input.nextDouble();
		System.out.print("Enter the diagonal2: ");
		double diagonal_2 = input.nextDouble();
		
		double area = (0.5) * diagonal_1 * diagonal_2;
		System.out.println("Area of Rhombus: "+area);
		input.close();
	}

}
