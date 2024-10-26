package Exercises;

import java.util.Scanner;

public class RemoveRepArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the given number: ");
		int[] num = new int [5];
		for(int j=0; j<5; j++)
		{
			num[j] = sc.nextInt();
		}
		System.out.println("Enter the number to get the duplicate count: ");
		int d = sc.nextInt();
		//int d=num[0];
		int count=0;
		for (int i=0; i<num.length-1; i++)
		{
			if(num[i]==d)
			{
				count++;
			}
		}
		
		System.out.println("The duplicate numbers is:" +" "+d+" and count is: "+ count);

	}

}
