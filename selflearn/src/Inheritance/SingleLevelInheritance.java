package Inheritance;

class Users {
	String username;
	String email;
	
	void login() {
		System.out.println(username + "Logged in.");
	}
	
	void Logout() {
		System.out.println(username + "Logged Out.");
	}
}


class RegisteredUsed extends Users{
	String password;
	void register() {
		System.out.println(username + "registered with email" + email);
	}
	void resetPassword() {
		System.out.println(username + "reset the password.");
	}
}

class Admin extends Users{
	String adminLevel;
	void deleteUser(Users user) {
		System.out.println(username + "delete user" + user.username);
	}
	void ViewAllUsers() {
		System.out.println(username + " viewed all the users.");
	}
}

public class SingleLevelInheritance {
	public static void main(String [] args) {
		RegisteredUsed obj = new RegisteredUsed();
		obj.username = "Guest";
		obj.email = "guest@gmail.com";
		
	}

}
