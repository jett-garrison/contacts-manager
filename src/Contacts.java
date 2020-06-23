import java.util.ArrayList;
import java.util.List;

    public class Contacts {
//    private String contact;
    private String name;
    private String number;

    // getters and setters for contacts
    public Contacts(String name, String number){
        this.name = name;
        this.number = number;
    }


//    public String getContact(){ return contact;}
//    public void setContact(String contact){ this.contact = contact;}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }


//    public static List<String> contactList(List<Contacts> contacts){
//        List<String> contacts = new ArrayList<>();
//        for (Contacts  : contacts){
//            contacts.add(.getContact());
//        }
//        return contacts;
//    }
}
