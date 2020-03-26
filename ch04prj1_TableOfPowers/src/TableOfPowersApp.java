import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Table of Powers App!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		// Prompt User input - n
			System.out.println("Enter an integer: ");
			int n = sc.nextInt();
			String table = "";
			String header = "";
			header += "Number\tSquared\tCubed";
			header += "======\t======\t======";
			table += header;
		
		// Biz logic - square and cube formula
			
		// display output - display square and cube
			for (int i=1; i <= n; i++) {
			// each loop will produce 1 line in our table
			int squared = i*i;
			int cubed = i*i*i;
			String row = i+"\t"+squared+"\t"+cubed+"\n";
			table += row;
			}
			System.out.println(table);
			System.out.println();	
			System.out.println("Continue?");
			choice = sc.next();
		}
			// bye
			System.out.println("Bye");
			sc.close();
	}
	
}

