package ArrayConcepts;

public class PrintOddNumbers {

	public static void main(String[] args) {
		int [] num = {789, 65, 33, 20, 98, 45, 67, 234, 875, 655, 890};
		for (int i=0; i<num.length; i++) {
			if(num[i]%2!=0) {
				System.out.println(num[i]);
			}
		}
		System.out.println("Program Ends");
	}

}
