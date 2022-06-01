package appointment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class AppointmentTest {
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	@Test
	void IDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var appointment = new Appointment("12345678901", "05/24/2024", "Test");
		});
	}
	
	@Test
	void IDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var appointment = new Appointment(null, "05/24/2024", "Test");
		});
	}
	
	@Test
	void dateInPast() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var appointment = new Appointment("1", "05/24/1999", "Test");
		});
	}

	@Test
	void dateIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var appointment = new Appointment("1", null, "Test");
		});
	}
	
	@Test
	void dateFormat() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var appointment = new Appointment("1", "May 25, 2024", "Test");
		});
	}
	
	@Test
	void descTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var appointment = new Appointment("1", "05/24/2024", "123456789012345678901234567890123456789012345678901234567890");
		});
	}
	
	@Test
	void descIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			var appointment = new Appointment("1", "05/24/2024", null);
		});
	}
	
	@Test
	void getID() {
		var appointment = new Appointment("1", "05/24/2023", "Test");
		assertTrue(appointment.getID() == "1");
	}
	
	@Test
	void getDate() {
		var appointment = new Appointment("1", "05/24/2023", "Test");
		assertTrue(appointment.getDate() == "05/24/2023");
	}
	
	@Test
	void setDateIsNull() {
		var appointment = new Appointment("1", "05/24/2023", "Test");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointment.setDate(null);
		});
	}
	
	@Test
	void setDateFormat() {
		var appointment = new Appointment("1", "05/24/2023", "Test");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointment.setDate("May 24, 2023");
		});
	}
	
	@Test
	void setDateInPast() {
		var appointment = new Appointment("1", "05/24/2023", "Test");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointment.setDate("05/24/1999");
		});
	}

	@Test
	void SetDate() {
		var appointment = new Appointment("1", "05/24/2023", "Test");
		appointment.setDate("05/25/2023");
		assertTrue(appointment.getDate() == "05/25/2023");
	}
	
	@Test
	void getDesc() {
		var appointment = new Appointment("1", "05/24/2023", "Test");
		assertTrue(appointment.getDescription() == "Test");
	}
	
	@Test
	void SetDesc() {
		var appointment = new Appointment("1", "05/24/2023", "Test");
		appointment.setDescription("This is a test");
		assertTrue(appointment.getDescription() == "This is a test");
	}
	
	@Test
	void setDescIsNull() {
		var appointment = new Appointment("1", "05/24/2023", "Test");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointment.setDescription(null);
		});
	}
	
	@Test
	void setDescIsTooLong() {
		var appointment = new Appointment("1", "05/24/2023", "Test");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointment.setDescription("123456789012345678901234567890123456789012345678901234567890");
		});
	}
}
