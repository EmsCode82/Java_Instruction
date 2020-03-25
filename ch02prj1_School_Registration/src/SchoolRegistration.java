import java.util.Scanner;

public class SchoolRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to Student Registration App");
		Scanner sc = new Scanner(System.in);
        // get user input
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter birth year: ");
		int birthYear = sc.nextInt();
		
		// do business logic
		String fullName = firstName + " " + lastName;
		String tempPwd = firstName + "*" + birthYear;
		
		// display output
		System.out.println("Welcome " + fullName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: "+tempPwd);
		System.out.println("Bye!");
		sc.close();
	} 

}