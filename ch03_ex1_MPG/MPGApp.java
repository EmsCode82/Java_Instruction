import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class MPGApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Miles Per Gallon calculator");
		System.out.println(); // print a blank line

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles driven: ");
			String milesStr = sc.next();
			BigDecimal miles = new BigDecimal(milesStr);

			System.out.print("Enter gallons of gas used: ");
			
			BigDecimal gallons = sc.nextBigDecimal();

			double mpg = miles / gallons;
			mpg = (int) Math.round(mpg);
			mpg = (double) Math.round(mpg * 100) / 100;
			BigDecimal mpgs = miles.divide(gallons, 2, RoundingMode.HALF_UP);
			
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(2);

			System.out.println("Miles per gallon is " + mpg + ".");
			System.out.println("Miles per gallon is " + number.format(mpg) + ".");
			System.out.println("Miles per gallon is " + mpg + ".");
			System.out.println();

			System.out.print("Calculate another MPG? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}

}