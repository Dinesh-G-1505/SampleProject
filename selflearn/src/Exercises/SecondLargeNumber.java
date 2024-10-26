package Exercises;

public class SecondLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Second Largest number is:"+secondLargest());
		
	}
		
	public static int secondLargest() {	
		int [] in = {9, 7, 56, 71, 12, 1};
		int firstmax = in[0];
		int secondmax = in[1];
		for(int i=2; i<in.length; i++)
		{
			if(in[i]>firstmax)
			{
				secondmax = firstmax;
				firstmax = in[i];
				
			}
		}
		return secondmax;
	
	}
}
