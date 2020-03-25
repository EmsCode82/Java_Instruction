
public class BooleanInJava2 {

	public static void main(String[] args) {
		
		boolean passedDoor = true;
		boolean missedDoor = false;
		boolean passedAllDoors = false;
		int doorCount = 0;
		
		if(passedDoor) {
			System.out.println("We passed the first door");
			doorCount = doorCount + 1;
		}
		
		if(passedDoor) {
			System.out.println("We passed the second door");
			doorCount = doorCount + 1;
		}
		
		if(passedDoor) {
			System.out.println("We passed the third door");
			doorCount = doorCount + 1;
		}
		
		if(doorCount == 3) {
			passedAllDoors = true;
		}
		
		if(passedAllDoors) {
			System.out.println("You've found the Jade Monkey. Now you must return it before the next full moon.");
		}
	}
}
