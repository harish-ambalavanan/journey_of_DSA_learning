package basic_programs;

import java.util.Scanner;

public class Q14_VolumeOfCone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Volume of Cone");
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		System.out.print("Enter height: ");
		double height = input.nextDouble();
		double volume = Math.PI * Math.pow(radius, 2) * (height / 3);
		System.out.println("Volume of Cone: " + volume);
		input.close();
	}

}
