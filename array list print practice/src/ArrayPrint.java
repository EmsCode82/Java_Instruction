
import java.util.ArrayList;

import business.Pet;

public class ArrayPrint {

	public static void main(String[] args) {
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
}



