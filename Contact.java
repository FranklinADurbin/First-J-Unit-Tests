package contact;

public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Contact(String id, String fName, String lName, String phone, String add) {

        if (id == null || id.length() > 10) {
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
    }

    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName){
    	if (fName == null || fName.length() > 10) {
            throw new IllegalArgumentException("Invalid First Name");
        }
        firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
    	if (lName == null || lName.length() > 10) {
            throw new IllegalArgumentException("Invalid Last Name");
        }
        lastName = lName;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String phone) {
    	if (phone == null || phone.length() != 10 || phone.matches("[0-9]+") == false) {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
        phoneNumber = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String add) {
    	if (add == null || add.length() >= 30) {
            throw new IllegalArgumentException("Invalid Address");
        } 
        address = add;
    }

    public void deleteContact(Contact contact) {
        contactID = null;
        firstName = null;
        lastName = null;
        phoneNumber = null;
        address = null;
    }
}
