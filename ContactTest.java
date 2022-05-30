package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testcontact() {
		Contact contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		assertTrue(contact.getContactID().equals("123"));
		assertTrue(contact.getFirstName().equals("Franklin"));
		assertTrue(contact.getLastName().equals("Durbin"));
		assertTrue(contact.getPhone().equals("7402606638"));
		assertTrue(contact.getAddress().equals("13 Wendy Way"));
	}
	
	@Test
	void testcontactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var contact = new Contact("12345678901", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		});
	}
	
	@Test
	void testcontactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var contact = new Contact(null, "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		});
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var contact = new Contact("123", "Franklinlin", "Durbin", "7402606638", "13 Wendy Way");
		});
	}
	
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var contact = new Contact("123", null, "Durbin", "7402606638", "13 Wendy Way");
		});
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var contact = new Contact("123", "Franklin", "DurbinDurbin", "7402606638", "13 Wendy Way");
		});
	}
	
	@Test
	void testLasttNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var contact = new Contact("123", "Franklin", null, "7402606638", "13 Wendy Way");
		});
	}
	
	@Test
	void testPhoneIsNotDigits() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var contact = new Contact("123", "Franklin", "Durbin", "123456789a", "13 Wendy Way");
		});
	}
	
	@Test
	void testPhoneIsTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var contact = new Contact("123", "Franklin", "Durbin", "123456789", "13 Wendy Way");
		});
	}
	
	@Test
	void testPhoneIsTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var contact = new Contact("123", "Franklin", "Durbin", "12345678901", "13 Wendy Way");
		});
	}
	
	@Test
	void testPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var contact = new Contact("123", "Franklin", "Durbin", null, "13 Wendy Way");
		});
	}
	
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var contact = new Contact("123", "Franklin", "Durbin", "7402606638", null);
		});
	}
	
	@Test
	void testAddressIsTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "0123456789012345678901234567890123");
		});
	}
	
	@Test
	void testSetFirstName() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		contact.setFirstName("Test");
		assertTrue(contact.getFirstName() == "Test");
	}
	
	@Test
	void testSetLastName() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		contact.setLastName("Test");
		assertTrue(contact.getLastName() == "Test");
	}
	
	@Test
	void testSetPhone() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		contact.setPhone("1234567890");
		assertTrue(contact.getPhone() == "1234567890");
	}
	
	@Test
	void testSetAddress() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		contact.setAddress("Test");
		assertTrue(contact.getAddress() == "Test");
	}
	
	@Test
	void setFirstNameTooLong() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName("This First Name has too many characters.");
		});
	}
	
	@Test
	void setLastNameTooLong() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName("This Last Name has too many characters.");
		});
	}
	
	@Test
	void setPhoneTooLong() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone("01234567890");
		});
	}
	
	@Test
	void setPhoneNotDigits() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone("ABCDEFGHIHJ");
		});
	}
	
	@Test
	void setAddTooLong() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress("This Address has too many characters.This Address has too many characters.This Address has too many characters.This Address has too many characters.");
		});
	}
	
	@Test
	void setFirstNameIsNull() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName(null);
		});
	}
	
	@Test
	void setLastNameIsNull() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName(null);
		});
	}
	
	@Test
	void setPhoneIsNull() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone(null);
		});
	}
	
	@Test
	void setAddIsNull() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress(null);
		});
	}
	
	@Test
	void deleteTest() {
		var contact = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		contact.deleteContact(contact);
		assertTrue(contact.getContactID() == null && contact.getFirstName() == null && contact.getLastName() == null && contact.getPhone() == null && contact.getAddress() == null);
	}
	
}
