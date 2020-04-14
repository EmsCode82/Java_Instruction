package ui;

import java.util.ArrayList;
import java.util.List;

import business.Contact;
import business.TestContact;

public class ContactManagerApp {

	public static void main(String[] args) {
		System.out.println("Hello");

		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5458"));
		contacts.add(new Contact("Bill Jenkins", null, null));
		contacts.add(new Contact("Josie Bedhead", "josie@murach.com", null));

		// print list of all contacts
		System.out.println("All contacts");
		displayContacts(contacts);
		System.out.println("List of Contacts missing phone #'s ");
		List<Contact> contactsNoPhone = filterContactsWithoutPhone(contacts);

		System.out.println("List of Contacts missing phone #'s - Lambda");
		List<Contact> contactsNoPhone2 = filterContacts(contacts, c -> c.getPhone() == null);
		displayContacts(contactsNoPhone2);
		System.out.println("Goodbye");
	}

	private static void displayContacts(List<Contact> contacts) {
		for (Contact c : contacts) {
			System.out.println(c);
		}
	}

	public static List<Contact> filterContactsWithoutPhone(List<Contact> contacts) {

		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c : contacts) {
			if (c.getPhone() == null) {
				contactsWithoutPhone.add(c);
			}
		}
		return contactsWithoutPhone;
	}

	public static List<Contact> filterContacts(List<Contact> contacts, TestContact condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c : contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return contacts;
	}
}
