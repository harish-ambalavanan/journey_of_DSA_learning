package intermediate_programs;

import java.util.Scanner;

public class Q06_CommissionPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// commission_price = sales_price * (commission_percentage / 100)
		// commission_percentage = (commission_price / sales_price) * 100;
		System.out.println("Commission Percentage");
		System.out.print("Enter sales price: ");
		double sales_price = input.nextDouble();
		System.out.print("Enter commission price: ");
		double commission_price = input.nextDouble();
		float commission_percentage = (float) (commission_price / sales_price) * 100;
		System.out.println("Commission Percentage: " + commission_percentage);
		input.close();
	}

}
