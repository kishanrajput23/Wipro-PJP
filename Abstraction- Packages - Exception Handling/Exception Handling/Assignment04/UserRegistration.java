import java.util.Scanner;

class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India cannot be registered");
	}
}

public class UserRegistration {

	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "", countryName = "";
		System.out.print("Enter the name of user :");
		name = scan.nextLine();
		System.out.print("Enter country name :");
		countryName = scan.nextLine();
		UserRegistration registration = new UserRegistration();
		try {
			registration.registerUser(name, countryName);
		} 
		catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}

}
