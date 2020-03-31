
public class ContactListApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Contact List Application");
		
		// Get User Input : First name, Last name, Email, Phone
		String fn = Console.getString("Enter first name:  ");
		String ln = Console.getString("Enter last name:  ");
		String e = Console.getString("Enter email:  ");
		String pn = Console.getString("Enter phone:  ");
		
		// Do Biz Logic Create an instance of Contact
		Contact c = new Contact(fn,ln,e,pn);
		
		// Display Results: Current Contact display - per specs
		System.out.println(c.displayContact());
		// Bye

	}

}
