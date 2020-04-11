package ui;

import java.util.ArrayList;
import java.util.List;

import business.Pet;
import util.Console;

public class PetStoreApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pet Store App!");
		System.out.println(
				"This application will manage a list of pets. \nYou can add pets to the inventory, and remove them when they get adopted.");
		displayMenu();
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			command = Console.getString("Command?: ", true);
		}
		String action = "";
		while (!action.equalsIgnoreCase("exit")) {
			action = Console.getString("Enter a command: ");
			System.out.println();
			if (action.equalsIgnoreCase("list")) {
				displayAllPets();
			} else if (action.equalsIgnoreCase("add")) {
				addPet();
			} else if (action.equalsIgnoreCase("adopt") || action.equalsIgnoreCase("delete")) {
			//    adoptPet();
			} else if (action.equalsIgnoreCase("exit")) {
				System.out.println("Bye.\n");
			} else {
				System.out.println("Error! Not a valid command.\n");
			}
		}
	}

	public static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("List    - List all Pets");
		System.out.println("Add     - Add a Pet to Inventory");
		System.out.println("Adopt    - Adopt a Pet");
		System.out.println("exit    - Exit the application\n");
	}

	public static void displayAllPets() {
		System.out.println("Pet Inventory");
		ArrayList<Pet> pets = new ArrayList<Pet>();
		pets = new ArrayList<Pet>();
		Pet p1 = new Pet(1, "Rabbit", "Holland Lop", "Bun", 1);
		Pet p2 = new Pet(2, "Cat", "Himalayan ", "Smokey", 3);
		pets.add(p1);
		pets.add(p2);
		for (Pet pet : pets) {
			System.out.println(pets);
		}
	}

	public static void addPet() {
		String type = Console.getString("Enter type: ");
		String species = Console.getString("Enter Species: ");
		String name = Console.getString("Enter name: ");
		int age = Console.getInt("Enter age: ");

		Pet pet = new Pet();
		pet.setType(type);
		pet.setSpecies(species);
		pet.setName(name);
		pet.setAge(age);

		System.out.println();
		System.out.println(type + " " + name + " " + species + " has been added.\n");
	}
}
/*
 * public static void adoptPet() { String pet =
 * Console.getString("Id of pet to adopt? "); System.out.println();
 * 
 * if (p != null) { System.out.println(p.getName() + " has been deleted.\n"); }
 * else { System.out.println("No pets match that Id.\n"); } }
 */
