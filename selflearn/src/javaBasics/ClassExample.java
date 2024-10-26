package javaBasics;

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog(); // object is created
		
		// Initialization of the object
		dog1.name="Tommy";
		dog1.type="friendly";
		dog1.color="White and Brown";
		System.out.println(dog1.name);
		System.out.println(dog1.type);
		System.out.println(dog1.color);
		dog1.barking();
		dog1.waggingTail();
		
Dog dog2=new Dog();
		
		dog2.name="resdor";
		dog2.type="security";
		dog2.color="Black";
		System.out.println(dog2.name);
		System.out.println(dog2.type);
		System.out.println(dog2.color);
		dog2.barking();
		dog2.waggingTail();
		
		Dog dog3=new Dog("Mike", "Domestic", "Wheat Brown");
		System.out.println(dog3.name);
		System.out.println(dog3.type);
		System.out.println(dog3.color);
		dog3.barking();
	}

}


class Dog{
	
	// State/Data - Variables and also known as fields
	String name;
	String type;
	String color;
	
	// A constructor - A method (Default constructor)
	public Dog() {
		System.out.println("Constructor is invoked");
	}
	// Parameterized Constructor or Overloaded Constructor
	public Dog(String inputName, String inputBread, String inputColor) {
		name=inputName;
		type=inputBread;
		color=inputColor;
		
	}
	
	// Behaviour/Functionality - Methods and also known ad functions
	
	public void barking() {
		System.out.println(name + " will bark when it see new peoples");
	}
	
	public void waggingTail() {
		System.out.println(name + " will Wag the tail when it see the owner");
	}
	
}