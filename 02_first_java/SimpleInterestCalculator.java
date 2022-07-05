import java.util.Scanner;

public class SimpleInterestCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the principle");
		int principle = input.nextInt();
		System.out.println("Enter the rate of interest");
		int rateOfInterest = input.nextInt();
		System.out.println("Enter the time");
		int time = input.nextInt();
		input.close();
		double simpleInterest = (principle * rateOfInterest * time) / 100;
		System.out.println("The simple interest is: " + simpleInterest);
	}
}
