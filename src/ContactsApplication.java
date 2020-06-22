import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ContactsApplication {

   static Input input = new Input();


   // creating user interface
    public static void main(String[] args) {
        boolean userChoice = true;
        do{
            System.out.println("1. View contacts.\n" +
                    "2. Add a new contact\n" +
                    "3. Search a contact by name\n" +
                    "4. Delete an existing contact\n" +
                    "5. Exit\n" +
                    "Enter and option (1, 2, 3, 4, or 5)");
            int userDecides = input.getInt(1,5);
            input.getString();
            if (userDecides == 1){

            }
        } while(userChoice);



        // working on File IO for contacts and creating the path to contacts.txt
        Path myDirectory = Paths.get("src");
        Path myContacts = Paths.get("src/util", "contacts.txt");
        System.out.println(Files.exists(myDirectory));
        System.out.println(Files.exists(myContacts));

        List<Contacts> contacts;
        List<String> contact = new ArrayList<>();

        try {
            contact = Files.readAllLines(myDirectory);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
