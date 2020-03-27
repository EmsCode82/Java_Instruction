import java.util.Scanner;

public class GreatestCommonDivisorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Greatest Common Divisor App");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		System.out.println();
		// -While loop begins here
		while (choice.equalsIgnoreCase("y")); {
		// Get user input -x -y
			System.out.println("Enter first number (x): ");
			int x = sc.nextInt();
			System.out.println("Enter second number (y): ");
			int y = sc.nextInt();
		// do biz logic -euclidean algorithm
		// do this until x == 0
			while (x>0) {
				while (y>=x) {
					// subtract x from y
					y -= x;
					//y = y - x
				}
				// swap values of x and y
				int hold = y;
				y = x;
				x = hold;
			}
			// y should be the greatest common divisor			
		// display output - greatest common divisor
			System.out.println("Greatest common divisor: "+y);
			System.out.println();
		// While loop ends here
			System.out.println("Continue? ");
			choice = sc.next();
		    System.out.println();
		// bye
            System.out.println("bye");
            sc.close();
	}

}
