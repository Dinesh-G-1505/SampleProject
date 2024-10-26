package Exercises;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=25;
//		int b=37;
//		int c=29;
//		
//		if(a<b && a<c)
//		{
//			System.out.println("The smallest number is:" + a);
//		}else if(b<a && b<c)
//		{
//			System.out.println("THe smallest number is:" + b);
//		}else if(c<a && c<b)
//		{
//			System.out.println("The smallest number is:" + c);
//		}else
//		{
//			System.out.println("None of the above is small number");
//		}
//	
//		int result = smallest(25, 37, 29);
//		
//		System.out.println("The smallet nember is:" + result);
//
		
//		System.out.println("Enter the first value: ");
//		int val1 = sc.nextInt();
//		System.out.println("Enter the Second value: ");
//		int val2 = sc.nextInt();
//		System.out.println("Enter the Third value: ");
//		int val3 = sc.nextInt();
//		
//		if(val1 < val2 && val1<val3)
//		{
//			System.out.println("The smallest number is: " + val1);
//		}else if(val2 < val1 && val2<val3)
//		{
//			System.out.println("The smallest number is: " + val2);
//		}else
//		{
//			System.out.println("The smallest number is: " + val3);
//		}
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers: ");
		int[] values = new int [5];
		for(int j=0; j<5; j++)
		{
			values[j] = sc.nextInt();
		}
		
		int min=values[0];
		
		
			for (int i=1; i<values.length; i++)
				{
					if(values[i]<min)
						{
							min = values[i];
				
						}
				}
			System.out.println("The samllest number is: "+ min);
		}
	}
