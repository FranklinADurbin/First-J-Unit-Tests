package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contactClass = new Contact("123", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		assertTrue(contactClass.getContactID().equals("123"));
		assertTrue(contactClass.getFirstName().equals("Franklin"));
		assertTrue(contactClass.getLastName().equals("Durbin"));
		assertTrue(contactClass.getPhone().equals("7402606638"));
		assertTrue(contactClass.getAddress().equals("13 Wendy Way"));
	}
	
	@Test
	void testContactClassIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact("12345678901", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		});
	}
	
	@Test
	void testContactClassIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact(null, "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		});
	}
	
	/*@Test
	  void testContactClassIDNotUnique() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact("1", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
			Contact contactClass1 = new Contact("1", "Franklin", "Durbin", "7402606638", "13 Wendy Way");
		});
	}*/

	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact("123", "Franklinlin", "Durbin", "7402606638", "13 Wendy Way");
		});
	}
	
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact("123", null, "Durbin", "7402606638", "13 Wendy Way");
		});
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact("123", "Franklin", "DurbinDurbin", "7402606638", "13 Wendy Way");
		});
	}
	
	@Test
	void testLasttNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact("123", "Franklin", null, "7402606638", "13 Wendy Way");
		});
	}
	
	@Test
	void testPhoneIsNotDigits() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact("123", "Franklin", "Durbin", "123456789a", "13 Wendy Way");
		});
	}
	
	@Test
	void testPhoneIsTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact("123", "Franklin", "Durbin", "123456789", "13 Wendy Way");
		});
	}
	
	@Test
	void testPhoneIsTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact("123", "Franklin", "Durbin", "12345678901", "13 Wendy Way");
		});
	}
	
	@Test
	void testPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact("123", "Franklin", "Durbin", null, "13 Wendy Way");
		});
	}
	
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact("123", "Franklin", "Durbin", "7402606638", null);
		});
	}
	
	@Test
	void testAddressIsTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contactClass = new Contact("123", "Franklin", "Durbin", "7402606638", "0123456789012345678901234567890123");
		});
	}
	
}
