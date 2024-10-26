package ArrayConcepts;

public class StoringValue {

	public static void main(String[] args) {
		int [] num = {2,3,23,45,56,76,89,90,5,3,2,12};
		// Printing Even numbers
		for (int i=0; i<num.length; i++) {
			if(num[i]%2==0)
			{
				System.out.println(num[i]);
			}
		}
		System.out.println("Program Ends");

	}

}
