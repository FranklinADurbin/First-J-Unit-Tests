package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {


	@Test
	void addingContact() {
		Contact contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
	}

	@Test
	void deletingContact() {
		Contact contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		contact.deleteContact(contact);
	}
	
	@Test
	void editingFirstName() {
		Contact contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		String newFirstName = "Bob";
		contact.setFirstName(newFirstName);
		contact.getFirstName().equals(newFirstName);
	}
	
	@Test
	void editingLastName() {
		Contact contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		String newLastName = "Bob";
		contact.setLastName(newLastName);
		contact.getLastName().equals(newLastName);
	}
	
	@Test
	void editingPhoneNumber() {
		Contact contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		String newPhone = "0123456789";
		contact.setPhone(newPhone);
		contact.getPhone().equals(newPhone);
	}
	
	@Test
	void editingAddress() {
		Contact contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		String newAddress = "Ohio";
		contact.setAddress(newAddress);
		contact.getAddress().equals(newAddress);
	}
}
