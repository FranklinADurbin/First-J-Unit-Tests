package appointment;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Appointment {
	private String id;
	private String date;
	private String desc;
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	public Appointment(String id, String date, String desc) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		try {
			if (date == null || format.parse(date).before(new Date())) {
				throw new IllegalArgumentException("Invalid Date");
			}
		} 
		catch (ParseException e) {
			throw new IllegalArgumentException("Invalid Date Format");
		}
		if (desc == null || desc.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		this.id = id;
		this.date = date;
		this.desc = desc;
	}
	
	public String getID() {
		return id;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		try {
			if (date == null || format.parse(date).before(new Date())) {
				throw new IllegalArgumentException("Invalid Date");
			}
		} 
		catch (ParseException e) {
			throw new IllegalArgumentException("Invalid Date Format");
		}
		this.date = date;
	}
	
	public String getDescription() {
		return desc;
	}
	
	public void setDescription(String desc) {
		if (desc == null || desc.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		this.desc = desc;
	}
	
	public void deleteAppointment(Appointment app) {
		id = null;
		date = null;
		desc = null;
	}
}
