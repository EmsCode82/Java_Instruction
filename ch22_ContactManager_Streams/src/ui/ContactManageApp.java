package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import business.Contact;

public class ContactManageApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		// Declare Array List
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5458"));
		contacts.add(new Contact("Bill Jenkins", null, null));
		contacts.add(new Contact("Josie Bedhead", "josie@murach.com", null));
		
		System.out.println("Display all Contacts");
		contacts.stream().forEach(c -> System.out.println(c));
		
		System.out.println("Contacts no Phone: - Print names");
		contacts.stream().filter(c -> c.getPhone()==null)
		                            .forEach(c -> System.out.println(c.getName()));
		
		System.out.println("Contacts no Phone: - collect in new list:");
		List<Contact> contactsNoPhone = contacts.stream().filter(
				                    c -> c.getPhone()==null)
		                            .collect(Collectors.toList());
		contactsNoPhone.stream().forEach(c -> System.out.println(c));
		System.out.println("There are "+contactsNoPhone.size()+" contacts with no phone.");
		
		System.out.println("Transform contact list to list of names:");
		List<String> contactNames = contacts.stream().map(c -> c.getName())
				                    .collect(Collectors.toList());
		contactNames.stream().forEach(str -> System.out.println(str));
		
		System.out.println("Transform contact list to list of names:colon");
		contactNames = contacts.stream().map(Contact::getName)
				                    .collect(Collectors.toList());
		contactNames.stream().forEach(System.out::println);
		// is equivalent to...
	//	for (String str: contactNames) {
	//		System.out.println(str);
		
		System.out.println("Reduce a list of contacts to a single string");
		String csv = contacts.stream().map(c -> c.getName()).reduce("", (a,b) -> a + b + ", ");
		csv = csv.substring(0, csv.length() - 2);
		System.out.println(csv);
		}
	}
