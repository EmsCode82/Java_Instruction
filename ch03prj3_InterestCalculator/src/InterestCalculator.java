import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class InterestCalculator {

	public static void main(String[] args) {
		// display a welcome message
		System.out.println("Welcome to the Interest Calculator\n");

		// create the Scanner object
		Scanner sc = new Scanner(System.in);

		// perform conversions until choice isn't equal to "y" or "Y"
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Without BigDecimal arithmetic, these values:
			// loanAmount = 4944.5
			// interestRate = .01
			// would result in a rounding error of $49.44

			// With BigDecimal arithmetic, these values
			// will be rounded correctly to $49.45

			// get the loan information from the user
			System.out.print("Enter loan amount:   ");
			String loanAmountString = sc.next();
			System.out.print("Enter interest rate: ");
			String interestRateString = sc.next();
			System.out.println();

			// calculate the interest amount
			BigDecimal loanAmount = new BigDecimal(loanAmountString);
			BigDecimal interestRate = new BigDecimal(interestRateString);
			BigDecimal interest = loanAmount.multiply(interestRate);
			interest = interest.setScale(2, RoundingMode.HALF_UP);

			// create the NumberFormat object for percentages
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);

			// create the NumberFormat object for currency
			NumberFormat currency = NumberFormat.getCurrencyInstance();

			// display the results
			System.out.println("Loan amount:         " + currency.format(loanAmount));
			System.out.println("Interest rate:       " + percent.format(interestRate));
			System.out.println("Interest:            " + currency.format(interest));
			System.out.println();

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
	}
}
