import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
	while (choice.equalsIgnoreCase("y")) {
		System.out.println("Enter numeric grade: ");
		int numericGrade = sc.nextInt();
		String letterGrade = "";
		
		if (numericGrade >= 88) {
			letterGrade = "A";
		}
		else if (numericGrade >= 80) {
			letterGrade = "B";
		}
		else if (numericGrade >= 67) {
			letterGrade = "C";
		}
		else if (numericGrade >= 60) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		System.out.println("Letter Grade: "+ letterGrade);
		System.out.print("Continue? ");
		choice = sc.next();
		}/* while( choice...oreCase("y") ) */
		// display output
		
		System.out.println("Bye");
		sc.close();

	}

}
