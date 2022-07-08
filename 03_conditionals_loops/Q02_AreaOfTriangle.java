package basic_programs;
import java.util.Scanner;

public class Q02_AreaOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Area of Triangle");
		System.out.print("Enter the base: ");
		double base = input.nextDouble();
		System.out.print("Enter the height: ");
		double height = input.nextDouble();
		
		double area = (0.5) * base * height;
		System.out.println("Area of triangle is "+area);
		input.close();
	}
}
