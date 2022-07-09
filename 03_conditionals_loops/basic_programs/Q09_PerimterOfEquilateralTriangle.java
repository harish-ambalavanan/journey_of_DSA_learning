package basic_programs;
import java.util.Scanner;
public class Q09_PerimterOfEquilateralTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Perimeter of Equilateral Triangle");
		System.out.print("Enter the value of side: ");
		double side = input.nextDouble();
		double result = 3 * side;
		System.out.println("Perimeter of Equilateral Triangle: "+ result);
		input.close();
	}
}

