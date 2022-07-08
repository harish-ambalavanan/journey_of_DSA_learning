package basic_programs;

import java.util.Scanner;

public class Q05_Parellelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Area of Parallelogram");
		System.out.print("Enter the base: ");
		double base = input.nextDouble();
		System.out.print("Enter the height: ");
		double height = input.nextDouble();
		
		double area = base * height;
		System.out.println("Area of Parallelogram: "+area);
		input.close();
	}

}
