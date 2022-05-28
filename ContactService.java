package contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactService {

    public static void main (String args[]) {
       String userInput;
       try (Scanner scanner = new Scanner(System.in)) {
        List<Contact> contacts = new ArrayList<Contact>();

           do {
               System.out.println("Menu");
               System.out.println("1. Add a new contact.");
               System.out.println("2. Edit an existing contact.");
               System.out.println("3. Delete an existing contact.");
               System.out.println("Press \"q\" to quit.");

               userInput = (scanner.nextLine());

                if (userInput.equals("1")) {
                    
                    System.out.println("Enter unique contact ID: ");
                    String tmpContactID = scanner.nextLine();
                   
                    System.out.println("Enter first name: ");
                    String tmpFirstName = scanner.nextLine();

                    System.out.println("Enter last name: ");
                    String tmpLastName = scanner.nextLine();

                    System.out.println("Enter phone number: ");
                    String tmpPhone = scanner.nextLine();

                    System.out.println("Enter address: ");
                    String tmpAddress = scanner.nextLine();
                    
                    Contact contact = new Contact(tmpContactID, tmpFirstName, tmpLastName, tmpPhone, tmpAddress);
                    contacts.add(contact);

               }

                else if (userInput.equals("2")) {
                   System.out.println("Enter contact ID desired to be edited.");
                   String id = scanner.nextLine();
                   String input;
                   Contact contactToEdit = null;

                   for (Contact contact : contacts) {
                       if (contact.getContactID().equals(id)) {
                           System.out.println("Contact ID: " + contact.getContactID());
                           System.out.println("First name: " + contact.getFirstName());
                           System.out.println("Last name: " + contact.getLastName());
                           System.out.println("Phone: " + contact.getPhone());
                           System.out.println("Address: " + contact.getAddress());
                           contactToEdit = contact;
                       }
                   }

                   if (contactToEdit == null) {
                        System.out.println("This contact ID does not exists.");
                   }
                   else {             
                    System.out.println("Which field is desired to be updated?");
                    System.out.println("1. First Name");
                    System.out.println("2. Last Name");
                    System.out.println("3. Phone Number");
                    System.out.println("4. Address");
                    System.out.println("Press \"q\" to return.");
                    
                    input = scanner.nextLine();

                    if (input.equals("1")) {
                        System.out.println("Current first name: " + contactToEdit.getFirstName());
                        System.out.println("Enter desired first name.");
                        String newFirstName = scanner.nextLine();
                        contactToEdit.setFirstName(newFirstName);
                        System.out.println("New first name: " + contactToEdit.getFirstName());
                    }

                    else if (input.equals("2")) {
                        System.out.println("Current last name: " + contactToEdit.getLastName());
                        System.out.println("Enter desired last name.");
                        String newLastName = scanner.nextLine();
                        contactToEdit.setLastName(newLastName);
                        System.out.println("New last name: " + contactToEdit.getLastName());
                    }

                    else if (input.equals("3")) {
                        System.out.println("Current phone number: " + contactToEdit.getPhone());
                        System.out.println("Enter desired phone number.");
                        String newPhone = scanner.nextLine();
                        contactToEdit.setPhone(newPhone);
                        System.out.println("New phone number: " + contactToEdit.getPhone());
                    }

                    else if (input.equals("4")) {
                        System.out.println("Current address: " + contactToEdit.getAddress());
                        System.out.println("Enter desired address.");
                        String newAddress = scanner.nextLine();
                        contactToEdit.setAddress(newAddress);
                        System.out.println("New address: " + contactToEdit.getAddress());
                    }

                    else if (input.equals("q")) {
                        return;
                    }

                    else {
                        System.out.println("Please enter a valid value.");
                    }
                   }
                }

                else if (userInput.equals("3")) {
                    System.out.println("Enter contact ID desired to be deleted.");
                    String id = scanner.nextLine();
                    String input;
                    Contact contactToDelete = null;

                    for (Contact contact : contacts) {
                        if (contact.getContactID().equals(id)) {
                            System.out.println("Contact ID: " + contact.getContactID());
                            System.out.println("First name: " + contact.getFirstName());
                            System.out.println("Last name: " + contact.getLastName());
                            System.out.println("Phone: " + contact.getPhone());
                            System.out.println("Address: " + contact.getAddress());
                            contactToDelete = contact;
                        }

                    }

                    if (contactToDelete == null) {
                        System.out.println("This contact ID does not exists.");
                    }
                    
                    else {
                        System.out.println("Are you sure you wish to delete this contact?");
                        System.out.println("y - Yes \n n - No");
                        input = scanner.nextLine();

                        if (input.equals("y")) {
                            contactToDelete.deleteContact(contactToDelete);
                        }

                        else {
                            System.out.println("Returning to menu.");
                        }
                    }
                }

                else if (userInput.equals("q")) {
                    break;
                }

                else {
                    System.out.println("Please enter a valid value.");
                }
           } while (!userInput.equals("q"));
        }
    }
}