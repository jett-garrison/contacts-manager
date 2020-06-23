import java.util.ArrayList;
import java.util.List;

public class Contacts {
        private String name;

        public Contacts(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

    public static List<Contacts> nameStringsToContacts(List<String> names) {
        List<Contacts> contacts = new ArrayList<>();
        for (String name : names) {
            contacts.add(new Contacts(name));
        }
        return contacts;
    }

}
