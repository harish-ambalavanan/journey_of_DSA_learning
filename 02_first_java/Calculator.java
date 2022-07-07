import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the operator (+, -, *, /): ");
		char operator = input.next().charAt(0);
		System.out.print("Enter the number 1: ");
		double number1 = Double.parseDouble(input.next());
		System.out.print("Enter the number 2: ");
		double number2 = Double.parseDouble(input.next());
		input.close();

		if (operator == '+')
			System.out.println(number1 + number2);
		else if (operator == '-')
			System.out.println(number1 - number2);
		else if (operator == '*')
			System.out.println(number1 * number2);
		else if (operator == '/')
			System.out.println(number1 / number2);
		else
			System.out.println("Invalid Operator");
	}

}
