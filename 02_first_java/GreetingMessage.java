import java.util.Scanner;
public class GreetingMessage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		input.close();
		System.out.println("Hey "+name+", Welcome");
	}
}
