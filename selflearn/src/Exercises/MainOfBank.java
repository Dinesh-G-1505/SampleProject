package Exercises;

public class MainOfBank 
{
	public static void main(String [] args)
	{
		//upcasting of SBI
		System.out.println("----------SBI Details----------");
		Bank b = new SBI();
		b.account();
		b.interest();
			
		//upcasting of SBIL
		System.out.println("----------SBIL Details----------");
		SBI s = new SBIL();
		s.account();
		s.interest();
	
	}
}
