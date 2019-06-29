package msit;

import java.util.Scanner;

public class Exp1c {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter String:");
		String a=scan.nextLine();
		System.out.println("Enter Number:");
		int b=scan.nextInt();
		System.out.println("Enter Float:");
		float c=scan.nextFloat();
		System.out.println("Enter Double:");
		double d=scan.nextDouble();
		System.out.println("Enter Character:");
		char e=scan.next().charAt(0);
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		

	}

}
