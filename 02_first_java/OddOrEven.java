import java.util.Scanner;
public class OddOrEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		if(num % 2 == 0)
			System.out.printf("Given number %d is even",num);
		else
			System.out.printf("Given number %d is odd",num);
	}
}
