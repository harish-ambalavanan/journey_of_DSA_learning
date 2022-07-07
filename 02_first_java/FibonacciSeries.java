//import java.util.*;
public class FibonacciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int first = 0;
		int second = 1;
		System.out.print(first + ", " + second);
		int result;
		for (int i = 2; i <= n; i++) {
			//result = first;
			//first = second;
			//second = result + second; // either + second or + first, because first got the value of second
			//System.out.print(", "+ second);
		
			result = first + second;
			first = second;
			second = result;
			System.out.print(", " + result);
			//Followed above one for convenience
		}
	}	
}
