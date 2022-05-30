package contact;
import java.util.ArrayList;
import java.util.List;

public class ContactService {
	public List<Contact> contacts = new ArrayList<Contact>();
	
	public void addContact(String id, String fName, String lName, String phone, String address) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactID() == id) {
				throw new IllegalArgumentException("Invalid ID");
			}
		}
		Contact contact = new Contact(id, fName, lName, phone, address);
		contacts.add(contact);
	}
	
	public void deleteContactByID(String id) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactID() == id) {
				contacts.get(i).deleteContact(contacts.get(i));
				contacts.remove(contacts.get(i));
				return;
			}
		}
		throw new IllegalArgumentException("Invalid ID");
	}
	
	public void updateContactFirstName(String id, String name) {
		for (int i = 0; i < contacts.size(); i++ ) {
			if (contacts.get(i).getContactID() == id) {
				contacts.get(i).setFirstName(name);
				return;
			}
		}
		throw new IllegalArgumentException("Invalid ID");
	}
	
	public void updateContactLastName(String id, String name) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactID() == id) {
				contacts.get(i).setLastName(name);
				return;
			}
		}
		throw new IllegalArgumentException("Invalid ID");
	}
	
	public void updateContactPhone (String id, String phone) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactID() == id) {
				contacts.get(i).setPhone(phone);
				return;
			}
		}
		throw new IllegalArgumentException("Invalid ID");
	}
	
	public void updateContactAdd(String id, String add) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getContactID() == id) {
				contacts.get(i).setAddress(add);
				return;
			}
		}
		throw new IllegalArgumentException("Invalid ID");
	}
}
