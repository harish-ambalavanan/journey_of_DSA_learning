package intermediate_programs;

import java.util.Scanner;

public class Q03_AverageOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value of N to get average of N numbers: ");
		int n = input.nextInt();
		int sum = 0;
		int number;
		for (int i = 1; i <= n; i++) {
			number = input.nextInt();
			sum += number;
		}
		double average = (double) sum / n;
		System.out.println("Average of N numbers: " + average);
		input.close();
	}

}
