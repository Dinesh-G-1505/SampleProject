package javaBasics;

public class JavaMethodsExample {

	public static void main(String[] args) {
		int sum=addingNumber(20, 80);
		
		String fullName=addTwoStrings("Dinesh", "Ganesan");
		System.out.println(fullName);
		displayWithDesign("Dinesh Ganean");
		displayWithDesign("Ranganadhan");
		int add=addingNumber(12, 90, 43);
		

	}
	// Method overloading -- also known as polymorphism
	// a Method to add two numbers
	public static int addingNumber(int a, int b) { // method parameters is also called as signature
		int result=a+b;
		System.out.println("Sum of two numbers are:" + result);
		return result;
	}
	// a Method to add three numbers
	public static int addingNumber(int a, int b, int c) { 
		int result=a+b+c;
		System.out.println("Sum of three numbers are:" + result);
		return result;
	}
	// a Method to add two strings
	public static String addTwoStrings(String x, String y) {
		return x+y;
	}
	// a Method to display value.
	public static void displayWithDesign(String value) {
		System.out.println("**********************");
		System.out.println("#######"+value+"######");
		System.out.println("**********************");
	}


}
