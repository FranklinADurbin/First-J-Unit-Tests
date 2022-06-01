package appointment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {

	@Test
	void addApp() {
		var service = new AppointmentService();
		service.addAppointment("1", "05/24/2023", "Test");
		assertTrue(service.apps.size() > 0);
	}
	
	@Test
	void addAppNotUniqueID() {
		var service = new AppointmentService();
		service.addAppointment("1", "05/24/2023", "Test");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.addAppointment("1", "05/25/2023", "Test");
		});
	}
	
	@Test
	void deleteAppInvalidID() {
		var service = new AppointmentService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.deleteAppointmentbyID("1");
		});
	}
	
	@Test
	void deleteApp() {
		var service = new AppointmentService();
		service.addAppointment("1", "05/24/2023", "Test");
		service.deleteAppointmentbyID("1");
		assertTrue(service.apps.size() == 0);
	}

}
