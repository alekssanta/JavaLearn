package HW07.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private static Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        List<String> phoneNumbers = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        phoneBook.put(lastName, phoneNumbers);
    }

    public static List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }
//    public static List<String> getNumberByLastname(String lastName) {
//        return PhoneBook.get(lastName);
//    }
//
////    private static List<String> get(String surname) {
////        return PhoneBook.get
////    }

}
