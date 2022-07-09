package basic_programs;
import java.util.Scanner;
public class Q21_FibanocciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = input.nextInt();
		int first = 0;
		int second = 1;
		int present = 0;
		System.out.println("Fibanocci Series upto "+ n +":");
		System.out.print(first + " " + second );
		for(int i = 2; i <= n; i++) {
			present = first + second;
			first = second;
			second = present;
			System.out.print(" " + present);
		}
		input.close();
	}
}
