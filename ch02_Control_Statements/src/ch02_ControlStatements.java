import java.util.Scanner;
public class ch02_ControlStatements {

			public static void main(String[] args) {
				String choice = "y";
				
				Scanner sc = new Scanner(System.in);
				while (choice.equalsIgnoreCase("y")) {
					System.out.println("choice is y!!!");
					System.out.print("Enter a number: ");
					int nbr = sc.nextInt();
					
					if (nbr < 0) {
						System.out.println("Error!  entry must be greater than 0!!");
					}
					else if (nbr > 100) {
						System.out.println("Error!  Entry must be less than 101!!");
					}
					else {
						System.out.println("Valid grade entered:  "+nbr);
					}
					
					System.out.println("Continue?");
					choice = sc.next();
				}
				System.out.println("Bye!");
				sc.close();
				

			}

		
	}


