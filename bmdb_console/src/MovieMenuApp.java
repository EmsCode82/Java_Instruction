import java.util.Scanner;

public class MovieMenuApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		// demonstrate the use of a switch statement in a menu
		String choice = "";
		while (!choice.equalsIgnoreCase("x")) {
			//display the menu
			String menu = "MENU\n" +
			              "============\n" +
					      "L - list all Movies\n" +
					      "A - Add a Movie\n" +
			              "D - Delete a Movie\n" +
					      "G - Get a Movie by ID\n" +
			              "X - exit\n";
			System.out.println(menu);
			//get the user choice
			choice = sc.next();
			
			//do something based on that choice
			switch (choice) {
			case "l":
			case "L":
			System.out.println("Listing all Movies...");
				break;
			case "a":	
			case "A":
			System.out.println("Adding Movie...");
				break;
			case "d":	
			case "D":
			System.out.println("Deleting Movie...");
				break;
			case "g":	
			case "G":
			System.out.println("Get Movie by ID...");
				break;
			case "x":	
			case "X":
				break;
				default:
			System.out.println("Invalid choice, try again.");
			break;
			}
		}
			
			
		System.out.println("Goodbye");
        sc.close();
	}

}
