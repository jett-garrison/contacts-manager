import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.IOException;

public class ContactsApplication {
    public static void main(String[] args) {


        String directory = "test";
        Path myContacts = Paths.get(directory, "contacts.txt");

//        System.out.println(Files.exists(myDirectory));
        System.out.println(Files.exists(myContacts));



//        String[] name = {"michael", "greg"};
//        List<String> contacts = null;
//        try {
//            contacts = Files.readAllLines(myContacts);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        System.out.println(contacts);
//        contacts.add("greg");

        List<String> contact = new ArrayList<>();
        contact.add("Michael");
        contact.add("Greg");


        try {
            Files.write(myContacts,contact);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(contacts);
    }

//   static Input input = new Input();
//
//
//   // creating user interface
//    public static void main(String[] args) {
//        boolean userChoice = true;
//        do{
//            System.out.println("1. View contacts.\n" +
//                    "2. Add a new contact\n" +
//                    "3. Search a contact by name\n" +
//                    "4. Delete an existing contact\n" +
//                    "5. Exit\n" +
//                    "Enter and option (1, 2, 3, 4, or 5)");
//            int userDecides = input.getInt(1,5);
//            input.getString();
//            if (userDecides == 1){
//
//            }
//        } while(userChoice);
//
//
//
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
//    }
}
