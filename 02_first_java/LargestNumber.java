import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int numberOne = input.nextInt();
		System.out.print("Enter number2: ");
		int numberTwo = input.nextInt();
		input.close();
		if (numberOne > numberTwo)
			System.out.println("The largest number is " + numberOne);
		else if(numberOne < numberTwo)
			System.out.println("The largest number is " + numberTwo);
		else
			System.out.println("The given numbers are equal");
	}
}
