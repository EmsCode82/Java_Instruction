
public class PersonManagerAPp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the person manager app");
		// -- continue prompt start
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// prompt for user input
			String type = EConsole.getString("Create customer or employee? (c/e):", "c", "e");
			String fn = EConsole.getString("First Name: ", true);
			String ln = EConsole.getString("Last Name: ", true);
			// do biz logic
			Person p;
			if (type.equalsIgnoreCase("c")) {
				// person is a customer
				String custNbr = EConsole.getString("Customer Number:  ", true);
				Customer c = new Customer(fn, ln, custNbr);
				p = c;
			} else {
				// person is employee
				String ssn = EConsole.getString("SSN:  ", true);
				Employee e = new Employee(fn, ln, ssn);
				p = e;
			}
			// display results
			System.out.println();
			System.out.println("You entered a new " + p.getClass());
			System.out.println(p.toString());
			System.out.println();

			choice = EConsole.getString("Continue? (y/n): ", "y", "n");
			// -- continue prompt end
			System.out.println();
		}
		// bye
		System.out.println("Bye!");
	}

}
