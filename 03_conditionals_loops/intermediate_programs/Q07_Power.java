package intermediate_programs;

import java.util.Scanner;

public class Q07_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Power");
		System.out.print("ENter number: ");
		double number = input.nextDouble();
		System.out.print("Enter the power number: ");
		int power = input.nextInt();
		double powerValue = number;
		for (int i = 2; i <= power; i++) {
			powerValue *= number;
		}
		System.out.println(number + "^" + power + " = " + powerValue);
		input.close();
	}

}
