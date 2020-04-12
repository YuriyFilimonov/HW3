package PhoneBook;

import java.util.*;

public class PhoneBook {
    Person person;
    Map<String, Person> phoneBook;
    Set<String> keys;
    List<String> subscriber;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void setPhoneBook(String surname, String phone, String email) {
        person = new Person(phone, email);
        phoneBook.put(surname + " " + phone + " " + email, person);
    }

    public void getPhone(String surname) {
        keys = phoneBook.keySet();
        subscriber = new ArrayList<>();
        for (String key : keys) {
            String[] key0 = key.split(" ");
            if (key0[0].equals(surname)) {
                subscriber.add(phoneBook.get(key).numberPhone);
            }
        }
        System.out.println("Список телефонов абонента: " + surname + " " + subscriber);
    }

    public void getEmail(String surname) {
        keys = phoneBook.keySet();
        subscriber = new ArrayList<>();
        for (String key : keys) {
            String[] key0 = key.split(" ");
            if (key0[0].equals(surname)) {
                subscriber.add(phoneBook.get(key).email);
            }
        }
        System.out.println("Список email абонента: " + surname + " " + subscriber);
    }
}
