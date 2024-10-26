package Exercises;

public class SBI extends Bank
{
	String name ="MSD";
	String branch = "UK";
	
	@Override
	public void account() 
	{
		System.out.println("Account holder name: "+name);
		System.out.println("Branch name: "+branch);
	}
	
	@Override
	public void interest()
	{
		System.out.println("The interest rate of SBI is 12%");
	}
}
