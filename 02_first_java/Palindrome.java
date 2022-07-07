import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String original = input.nextLine();
		String reversal = "";
		for(int i = original.length() - 1; i >= 0 ; i--) {
			reversal += original.charAt(i);
		}
		if(original.equalsIgnoreCase(reversal))
			System.out.println(original+" is palindrome");
		else
			System.out.println(original + " is not a palindrome");
		input.close();
	}

}
