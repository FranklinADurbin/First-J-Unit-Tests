package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void addContactIDNotUnique() {
		var service = new ContactService();
		service.addContact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.addContact("123", "Test", "Test", "1234567890", "Test");
		});
	}

	@Test 
	void addContact() {
		var service = new ContactService();
		service.addContact("132", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		assertTrue(service.contacts.size() == 1);
	}
	
	@Test
	void deleteContact() {
		var service = new ContactService();
		service.addContact("132", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		service.addContact("1", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		service.deleteContactByID("132");
		assertTrue(service.contacts.size() == 1);
	}
	
	@Test
	void deleteContactInvalidID () {
		var service = new ContactService();
		service.addContact("132", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.deleteContactByID("1");
		});
	}
	
	@Test
	void updateFirstNameInvalidID() {
		var service = new ContactService();
		service.addContact("132", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactFirstName("1", "Test");
		});
	}
	
	@Test
	void updateFirstName() {
		var service = new ContactService();
		service.addContact("132", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		service.updateContactFirstName("132", "Test");
		assertTrue(service.contacts.get(0).getFirstName() == "Test");
	}
	
	@Test
	void updateLastNameInvalidID() {
		var service = new ContactService();
		service.addContact("132", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactLastName("1", "Test");
		});
	}
	
	@Test
	void updateLastName() {
		var service = new ContactService();
		service.addContact("132", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		service.updateContactLastName("132", "Test");
		assertTrue(service.contacts.get(0).getLastName() == "Test");
	}
	
	@Test
	void updatePhoneInvalidID() {
		var service = new ContactService();
		service.addContact("132", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactPhone("1", "1234567890");
		});
	}
	
	@Test
	void updatePhone() {
		var service = new ContactService();
		service.addContact("132", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		service.updateContactPhone("132", "1234567890");
		assertTrue(service.contacts.get(0).getPhone() == "1234567890");
	}
	
	@Test
	void updateAddressInvalidID() {
		var service = new ContactService();
		service.addContact("132", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactAdd("1", "1234567890");
		});
	}
	
	@Test
	void updateAddress() {
		var service = new ContactService();
		service.addContact("132", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		service.updateContactAdd("132", "1234567890");
		assertTrue(service.contacts.get(0).getAddress() == "1234567890");
	}
}
