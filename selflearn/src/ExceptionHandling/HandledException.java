package ExceptionHandling;

import java.util.Scanner;

public class HandledException {

	public static void main(String[] args) {
		
		System.out.println("...Program Started...");		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the user input");		
		int num=ip.nextInt();
		try
		{
		System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid data. Provide a valid data here");
		}
		System.out.println("Program is completed");
		System.out.println("Program Ends");

	}

}
