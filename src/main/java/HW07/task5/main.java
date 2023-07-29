package HW07.task5;

import java.util.List;

public class main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123456789");
        phoneBook.add("Петров", "987654321");
        phoneBook.add("Сидоров", "555555555");
        phoneBook.add("Иванов", "111111111");

        List<String> ivanovPhones = phoneBook.get("Иванов");
        System.out.println("Телефоны Ивановых:");
        for (String phone : ivanovPhones) {
            System.out.println(phone);
        }
        List<String> petrovPhones = phoneBook.get("Петров");
        System.out.println("Телефоны Петровых:");
        for (String phone : petrovPhones) {
            System.out.println(phone);
        }

        List<String> sidorovPhones = phoneBook.get("Сидоров");
        System.out.println("Телефоны Сидоровых:");
        for (String phone : sidorovPhones) {
            System.out.println(phone);
        }
    }
}
