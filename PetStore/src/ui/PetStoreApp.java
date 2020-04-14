package ui;

import java.util.ArrayList;
import business.Pet;
import util.Console;

public class PetStoreApp {
	private static ArrayList<Pet> pets = new ArrayList<Pet>();

	public void List() {
		pets = new ArrayList<Pet>();
	}

	public static void main(String[] args) {
		Pet p1 = new Pet(1, "Rabbit", "Holland Lop", "Bun", 1);
		Pet p2 = new Pet(2, "Cat", "Himalayan ", "Smokey", 3);
		pets.add(p1);
		pets.add(p2);
		System.out.println("Welcome to the Pet Store App!");
		System.out.println("This application will manage a list of pets. "
				+ "\nYou can add pets to the inventory, and remove them " + "when they get adopted.");
		displayMenu();
		String action = "";
		while (!action.equalsIgnoreCase("exit")) {
			action = Console.getString("Enter a command: ");
			if (action.equalsIgnoreCase("list")) {
				displayAllPets();
			} else if (action.equalsIgnoreCase("add")) {
				addPet();
			} else if (action.equalsIgnoreCase("adopt") || action.equalsIgnoreCase("delete")) {
				adoptPet();
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
		System.out.println("Adopt   - Adopt a Pet");
		System.out.println("exit    - Exit the application\n");
	}

	public static void displayAllPets() {
		System.out.println("Pet Inventory");
		for (Pet pet : pets) {
			System.out.println(pet);
		}
	}

	public static void addPet() {
		int id = Console.getInt("Enter id:  ");
		String type = Console.getString("Enter type: ");
		String species = Console.getString("Enter Species: ");
		String name = Console.getString("Enter name: ");
		int age = Console.getInt("Enter age: ");
		Pet pet = new Pet();
		pet.setiD(id);
		pet.setType(type);
		pet.setSpecies(species);
		pet.setName(name);
		pet.setAge(age);
		Pet p = new Pet(id, type, species, name, age);
		pets.add(p);
		System.out.println();
		System.out.println(type + " " + name + " " + species + " has been added.\n");
	}

	public static void adoptPet() {
		System.out.println("Pet Adoption");
		int id = Console.getInt("Enter the ID you wish to adopt:  ");
		Pet setToDelete = null;
		for (Pet p : pets) {
			if (p.getiD() == id) {
				setToDelete = p;
				break;
			}
		}
		System.out.println();
		if (setToDelete != null) {
			pets.remove(setToDelete);
			System.out.println(setToDelete.getName() + " has been Adopted!.\n");
		} else {
			System.out.println("No pet matches that ID.\n");
		}
	}
}
