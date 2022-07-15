package intermediate_programs;

import java.util.Scanner;

public class Q05_DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Distance between two points");
		System.out.print("Enter x1: ");
		int x1 = input.nextInt();
		System.out.print("Enter x2: ");
		int x2 = input.nextInt();
		System.out.print("Enter y1: ");
		int y1 = input.nextInt();
		System.out.print("Enter y2: ");
		int y2 = input.nextInt();
		double answer = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
		System.out.println("Distance between two points: " + answer);
		input.close();
	}

}
