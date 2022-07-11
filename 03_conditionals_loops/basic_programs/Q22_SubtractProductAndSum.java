package basic_programs;

import java.util.Scanner;

public class Q22_SubtractProductAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		System.out.println("Result: "+subtractProductAndSum(n));	
	}

	public static int subtractProductAndSum(int n) {
		// int length = String.valueOf(n).length(); //for(int i = 1; i <= length; i++)
		int digit;
		int product = 1;
		int sum = 0;
		if (n == 0)
			return 0;

		while (n != 0) {
			digit = n % 10;
			product *= digit;
			sum += digit;
			n = n / 10;
		}
		return product - sum;
	}
}
