package Exercises;

import java.util.Scanner;
public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input text:");
		String name= in.nextLine();
		System.out.println("The Original String:"+name);
		
		
		for(int i=name.length()-1; i>=0; i--)
		{
			System.out.print(name.charAt(i));
			
		}
		
	}
	
	

}
