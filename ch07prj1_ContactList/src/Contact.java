
public class Contact {
    // 1. define instance variables : 
	//firstName, lastName, eMail, phoneNmr
	private String firstName;
	private String lastName;
	private String eMail;
	private String pHone;
	
	// 2. generate constructors always 2 of them. Default and fully loaded
	public Contact() {
		super();
	}
	
	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = email;
		this.pHone = phone;
	}

	// 3. generate getters / setters
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getpHone() {
		return pHone;
	}

	public void setpHone(String pHone) {
		this.pHone = pHone;
	}
	
	// 4. define displayContact method
	public String displayContact() {
		String contactStr = "---------------------------------\n" +
	                        "---------Current Contact---------\n" +
	                        "---------------------------------\n" +
	                        "Name:          "+firstName+" "+lastName+"\n" +	
	                        "Email Address: "+eMail+"\n" +
	                        "Phone Number:  "+pHone+"\n" +
	                        "---------------------------------\n";
	
		
		return contactStr;
	
}
	
}

	// 5. optional generate toString()