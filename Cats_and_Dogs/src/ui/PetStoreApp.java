package ui;

import util.Console;

public class PetStoreApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pet Store App!");
		System.out.println("This application will manage a list of pets. \nYou can add pets to the inventory, and remove them when they get adopted.");
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
		displayMenu();
		command = Console.getString("Command?: ", true);
		}
		
	}
	
public static void displayMenu() {
    System.out.println("COMMAND MENU");
    System.out.println("List    - List all Pets");
    System.out.println("Add     - Add a Pet to Inventory");
    System.out.println("Adopt     - Adopt a Pet");
    System.out.println("exit    - Exit the application\n");
}
}

