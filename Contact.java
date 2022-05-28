package contact;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    
    private String contactID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    List<String> ids = new ArrayList<String>();

    public Contact(String id, String fName, String lName, String phone, String add) {

        if (ids.contains(id) || id == null || id.length() > 10) {
            throw new IllegalArgumentException("Invalid Contact ID");
        }
        if (fName == null || fName.length() > 10) {
            throw new IllegalArgumentException("Invalid First Name");
        }
        if (lName == null || lName.length() > 10) {
            throw new IllegalArgumentException("Invalid Last Name");
        }
        if (phone == null || phone.length() != 10 || phone.matches("[0-9]+") == false) {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
        if (add == null || add.length() >= 30) {
            throw new IllegalArgumentException("Invalid Address");
        }    
        
        contactID = id;
        firstName = fName;
        lastName = lName;
        phoneNumber = phone;
        address = add;
        ids.add(id);
    }

    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName){
        firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String phone) {
        phone = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void deleteContact(Contact contact) {
        ids.remove(contact.getContactID());
        contactID = null;
        firstName = null;
        lastName = null;
        phoneNumber = null;
        address = null;
    }
}