import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.IOException;
import util.Input;

public class ContactsApplication {
    static Input input = new Input();

    public static void main(String[] args) {

        // creating directory for contacts.txt
        String directory = "test";
        Path myContacts = Paths.get(directory, "contacts.txt");
//        System.out.println(Files.exists(myContacts));


        // reading file names
//        String[] name = {"michael", "greg"};
        List<Contacts> contacts;
        List<String> name = new ArrayList<>();
        try {
         name = Files.readAllLines(myContacts);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(name);
        contacts = Contacts.nameStringsToContacts(name);


        // writing names to the file
//        List<String> contact = new ArrayList<>();
//        contact.add("Michael | 210-123-9876");
//        contact.add("Greg | 210-987-1234");
//        try {
//            Files.write(myContacts, contact);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(contacts);


//   // creating user interface
        boolean userChoice = true;
        do {
            System.out.println("1. View contacts.\n" +
                    "2. Add a new contact\n" +
                    "3. Search a contact by name\n" +
                    "4. Delete an existing contact\n" +
                    "5. Exit\n" +
                    "Enter and option (1, 2, 3, 4, or 5)");
            int userDecides = input.getInt(1, 5);
            input.getString();
            if (userDecides == 1) {
//                System.out.println(contacts);
                System.out.println("----------Here is a list of yor contacts------------");
                 viewContacts(name);
                System.out.println("----------Please enter a number between 1 and 5------------\n");
            } else if (userDecides == 2) {
                System.out.println("----------Please add a new contact------------");

            } else if (userDecides == 3) {

            } else if (userDecides == 4) {

            } else if (userDecides == 5) {
                break;
            }
        } while (userChoice);


//        // working on File IO for contacts and creating the path to contacts.txt
//        Path myDirectory = Paths.get("src");
//        Path myContacts = Paths.get("src/util", "contacts.txt");
//        System.out.println(Files.exists(myDirectory));
//        System.out.println(Files.exists(myContacts));
//
//        List<Contacts> contacts;
//        List<String> contact = new ArrayList<>();
//
//        try {
//            contact = Files.readAllLines(myDirectory);
//        } catch (IOException e){
//            e.printStackTrace();
//        }

    }

    // iterating through contacts to view the names and numbers
    public static void viewContacts(List<String> contacts) {
            for (String x : contacts) {
                System.out.println(x);
            }
        }

    public void addContact() throws IOException{

    }


}
