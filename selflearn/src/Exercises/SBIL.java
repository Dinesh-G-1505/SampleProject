package Exercises;

public class SBIL extends SBI
{
	String name = "Virat";
	String type = "Term";
	
	@Override
	public void account()
	{
		System.out.println("Account holder name: "+name);
		System.out.println("Insurance type: "+type);
	}
	
	@Override
	public void interest()
	{
		System.out.println("Interest rate for Insurance is 18%");
	}
	
}
