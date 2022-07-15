package intermediate_programs;

import java.util.Scanner;

public class Q04_DiscountOfProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Product price: ");
		double price = input.nextDouble();
		System.out.print("Discount percentage: ");
		float discountPercentage = input.nextFloat();
		double discountPrice = Math.floor(price * (discountPercentage / 100));
		double priceAfterDiscount = Math.floor(price - discountPrice);
		System.out.println(discountPercentage + "% discount price on a product: " + discountPrice);
		System.out.println("Price of a product after applying " + discountPercentage + "% is " + priceAfterDiscount);
		input.close();
	}
}
