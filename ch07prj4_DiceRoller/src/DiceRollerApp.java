
public class DiceRollerApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the dice roller!");
		// Get User Input: Roll Dice : Y or y to continue
		String choice = Console.getString("Roll the dice? (y/n)");
		
		while (choice.equalsIgnoreCase("y")) {
			// Biz Logic: Sum the dice
			Dice d = new Dice();
			d.roll();
			// Display Results: Display Total, Msg
			d.printRoll();
			choice = Console.getString("Roll again? (y/n)");
		}
		
	
		
		// Bye
		
		

	}

}
