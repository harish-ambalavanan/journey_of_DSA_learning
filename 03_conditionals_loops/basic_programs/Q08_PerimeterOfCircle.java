package basic_programs;
import java.util.Scanner;
public class Q08_PerimeterOfCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Perimeter of Circle");
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		double result = 2 * Math.PI * radius;
		System.out.println("Perimeter of Circle: "+ result);
		input.close();
	}
}
