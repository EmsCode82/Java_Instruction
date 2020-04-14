package ui;

import java.util.ArrayList;
import java.util.List;

import business.Pet;
import util.Console;

public class PetStoreApp {
	private static List<Pet> pets;

	public static void main(String[] args) {
		// initialize
		pets = new ArrayList<>();
		Pet p1 = new Pet(1, "Dog", "Collie", "Boogin", 6);
		Pet p2 = new Pet(2, "Dog", "Collie", "Doogin", 2);
		pets.add(p1);
		pets.add(p2);
		System.out.println("Welcome to the Pet Store App");
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command?: ", true);
			switch (command) {
			case "List":
				listPets();
				break;
			case "Add":
				addPet();
				break;
			case "Adopt":
				adoptPet();
				break;
			case "Exit":
				break;
			}
		}
		System.out.println("Bye");
	}

	private static void adoptPet() {
		System.out.println("List of All Pets");
		System.out.println("=================================");
		int id = Console.getInt("Id of pet to adopt?: ", 0, Integer.MAX_VALUE);
		// Find the pet whose ID matches the one entered
		Pet p = null;
		for (Pet foundPet : pets) {
			if (foundPet.getId() == id) {
				p = foundPet;
			}
		}
		if (p != null) {
			pets.remove(p);
			System.out.println("Pet adopted: " + p);
			System.out.println();
		}
		else {
			System.out.println("No pet found for id: "+id);
		}
	}

	private static void addPet() {
		System.out.println("Add a Pet");
		System.out.println("=================================");
		int id = Console.getInt("Id?: ", 0, Integer.MAX_VALUE);
		String type = Console.getString("Type?: ", true);
		String species = Console.getString("Species?: ", true);
		String name = Console.getString("Name?: ", true);
		int age = Console.getInt("Age?: ", 0, Integer.MAX_VALUE);
		Pet p = new Pet(id, type, species, name, age);
		pets.add(p);
		System.out.println("Pet Added: " + p);
		System.out.println();
	}

	private static void listPets() {
		System.out.println("List of All Pets");
		System.out.println("=================================");
		for (Pet p : pets) {
			System.out.println(p);
		}

	}

	private static void displayMenu() {
		System.out.println("====Command Menu====");
		System.out.println("====================");
		System.out.println("List  - List all pets");
		System.out.println("Add   - Add a pet");
		System.out.println("Adopt - Adopt a pet");
		System.out.println("Exit  - Exit the App");
		System.out.println();

	}

}
