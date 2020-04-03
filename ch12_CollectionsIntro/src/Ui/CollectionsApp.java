package Ui;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsApp {

	public static void main(String[] args) {
		System.out.println("Create an array of Ints...");
		int [] numbersArray = new int[5];
		numbersArray[0] = 5;
		numbersArray[1] = 7;
		numbersArray[2] = 15;
		numbersArray[3] = 22;
		numbersArray[4] = 3;
		
		for (int number: numbersArray) {
			System.out.println(number);
		}
		
		ArrayList<Integer> numbersList = new ArrayList<>();
		numbersList.add(5);
		numbersList.add(7);
		numbersList.add(15);
		numbersList.add(22);
		numbersList.add(3);
		for (int number: numbersList) {
			System.out.println(number);
		}
		System.out.println(numbersList);
		System.out.println("Size of array is "+numbersArray.length);
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Eric");
		names.add("alyssa");
		names.add("BBun");
		names.add("Oslo");
		System.out.println(names);

		System.out.println("What name is in position 2??: "+names.get(2));
		System.out.println("What name is in position 0??: "+names.get(0));
		System.out.println("How big is the arraylist??: "+names.size());
		System.out.println("Is BBun in the list???:"+names.contains("BBun"));
		System.out.println("Position of Alyssa: "+names.indexOf("Alyssa"));
		Collections.sort(names);
		System.out.println(names);
		Collections.sort(names,String.CASE_INSENSITIVE_ORDER);
		System.out.println(names);
		
	}

}
