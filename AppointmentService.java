package appointment;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
	public List<Appointment> apps = new ArrayList<Appointment>();
	
	public void addAppointment(String id, String date, String desc) {
		for (int i = 0; i < apps.size(); i++) {
			if (apps.get(i).getID() == id) {
				throw new IllegalArgumentException("Enter unique ID");
			}
		}
		Appointment newApp = new Appointment(id, date, desc);
		apps.add(newApp);
	}
	
	public void deleteAppointmentbyID(String id) {
		for (int i = 0; i < apps.size(); i++ ) {
			if (apps.get(i).getID() == id) {
				apps.get(i).deleteAppointment(apps.get(i));
				apps.remove(i);
				return;
			}
		}
		throw new IllegalArgumentException("Invalid ID");
	}
}
