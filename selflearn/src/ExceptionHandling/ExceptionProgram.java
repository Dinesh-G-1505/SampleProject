package ExceptionHandling;

import java.util.Scanner;

public class ExceptionProgram {

	public static void main(String[] args) {
		/*String s ="1234w";
		int num=Integer.parseInt(s); // NumberFormatException
		System.out.println(num);
		*/

		String s = null;
		System.out.println(s.length()); // NullPointerException
		
		System.out.println("...Program Started...");		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the user input");		
		int num=ip.nextInt();
		System.out.println(100/num); // ArthimeticException
		System.out.println("Program is completed");
		System.out.println("Program Ends");
	}

}
