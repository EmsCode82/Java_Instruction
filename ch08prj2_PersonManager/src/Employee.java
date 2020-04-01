
public class Employee extends Person {
     private String SSN;

	public Employee(String firstName, String lastName, String SSN) {
		super(firstName, lastName);
		this.SSN = SSN;
	}

	public Employee() {
		super();
	}
    // requirement mask ssn as xxx-xx-ssn
	public String getSSN() {
		String last4 = SSN.substring(8);
		return "xxx-xx-"+last4;
	}

	public void setSSN(String SSN) {
		this.SSN = SSN;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSSN: " + getSSN();
	}
     
}
