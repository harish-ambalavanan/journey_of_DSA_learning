package intermediate_programs;

import java.util.Scanner;

public class Q02_ElectricityBill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tamil Nadu Electricity Board");
		System.out.print("Enter the units(of 2 months): ");
		int units = input.nextInt();
		double electricityBill = 0;
		double fixedCharges;
		if (units < 0)
			System.out.println("Invalid units");
		else if (units <= 100) {
			fixedCharges = 0;
			electricityBill = (units * 2.50) + fixedCharges;
			electricityBill = electricityBill - (units * 2.5);
		} else if (units > 100 && units <= 200) {
			fixedCharges = 20;
			electricityBill = ((units - 100) * 1.50) + fixedCharges;
		} else if (units > 200 && units <= 500) {
			fixedCharges = 30;
			electricityBill = ((200 - 100) * 2) + ((units - 200) * 3.0) + fixedCharges;
			// slab 100 is 0, between 101 and 200, between 201 and 500 and so on
		} else if (units > 500) {
			fixedCharges = 50;
			electricityBill = ((200 - 100) * 3.5) + ((500 - 200) * 4.6) + ((units - 500) * 6.6) + fixedCharges;
			// 100 * 2.5 its free so 0, bw 101 and 200 --> 100 * 3.5, bw 201 and 500 --> 300 * 4.6,
			// above 500 --> (units - 500) * 6.6
		}
		// Calculated with subsidy, it means directly entered the values as per subsidy
		System.out.println("Electricity Bill: " + electricityBill);
		input.close();
	}

}
