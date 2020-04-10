package ui;

import java.util.ArrayList;
import java.util.List;
import business.DAO;
import business.Pet;
import business.StringUtils;
import util.Console;

public class PetStoreApp {
	private static DAO<Pet> petDAO = null;
	
	public static void main(String[] args) {
		List<Pet> pets = new ArrayList<>();
		Pet p1 = new Pet(1, "Cat", "Tortie", "Marley", 5);
		pets.add(p1);
		Pet p2 = new Pet(2, "Dog", "Collie", "Rusty", 8);
		pets.add(p2);
		for (Pet p: pets) {
			System.out.println(p);
		}
		System.out.println("Welcome to the Pet Store App!");
		System.out.println("This application will manage a list of pets. \nYou can add pets to the inventory, and remove them when they get adopted.");
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
		displayMenu();
		command = Console.getString("Command?: ", true);
		}
		String action = "";
        while (!action.equalsIgnoreCase("exit")) {
            // get the input from the user
            action = Console.getString("Enter a command: ");
            System.out.println();

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
    System.out.println("Adopt     - Adopt a Pet");
    System.out.println("exit    - Exit the application\n");
}

public static void displayAllPets() {
    System.out.println("Pet Inventory");
    List<Pet> pets = petDAO.getAll();
    Pet p;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < pets.size(); i++) {
        p = pets.get(i);
        sb.append(StringUtils.padWithSpaces(
        p.getName(), 27));
        sb.append("\n");
    }
    System.out.println(sb.toString());
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
    petDAO.add(pet);

    System.out.println();
    System.out.println(type + " " + name + " " + species
            + " has been added.\n");
}

public static void adoptPet() {
    String pet = Console.getString("Id of pet to adopt? ");

    Pet p = petDAO.get(pet);

    System.out.println();
    if (p != null) {
        petDAO.delete(p);
        System.out.println(p.getName()
                + " has been deleted.\n");
    } else {
        System.out.println("No pets match that Id.\n");
    }
    
}
}

