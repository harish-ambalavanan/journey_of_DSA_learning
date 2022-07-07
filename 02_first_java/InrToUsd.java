import java.util.Scanner;
public class InrToUsd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter currency in rupees(INR): ");
		long rupees = input.nextLong();
		double usd = rupees * 0.013;
		System.out.println("Currency in USD: "+usd);
		input.close();
	}
}
