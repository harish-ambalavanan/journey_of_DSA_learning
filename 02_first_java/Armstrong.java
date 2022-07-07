import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sum = 0;
		// int sum1 = 0;
		int copyOfNumber = number;
		int length = String.valueOf(number).length();
		int digit;
		for (int i = 0; i < length; i++) {
			// int temp = 1;
			digit = number % 10;
			number = number / 10;
			sum += Math.pow(digit, length);
			// System.out.println(digit);

			// for (int j = 0; j < length; j++) {
			// temp *= digit;
			// }
			// sum1 += temp;
		}
		if (copyOfNumber == sum)
			System.out.println("Given number " + copyOfNumber + " is an armstrong number");
		else
			System.out.println("Given number " + copyOfNumber + " is not an armstrong number");
		input.close();
	}

}
