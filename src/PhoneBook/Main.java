package PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.setPhoneBook("Иванов", "921-123-45-67", "ibanov@mail.ru");
        phoneBook.setPhoneBook("Петров", "911-123-45-67", "petrov@mail.ru");
        phoneBook.setPhoneBook("Сидоров", "952-123-45-67", "sidorov@mail.ru");
        phoneBook.setPhoneBook("Иванов", "920-123-45-67", "ibanoff@mail.ru");
        phoneBook.setPhoneBook("Иванов", "905-123-45-67", "iban@mail.ru");

        phoneBook.getPhone("Иванов");
        phoneBook.getEmail("Иванов");

        phoneBook.getPhone("Петров");
        phoneBook.getEmail("Петров");

        phoneBook.getPhone("Сидоров");
        phoneBook.getEmail("Сидоров");
    }
}
