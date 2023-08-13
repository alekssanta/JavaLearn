package HW08.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Макар", 25));
        people.add(new Person("Люсьен", 30));
        people.add(new Person("Иван", 20));

        Comparator<Person> nameComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());

        Comparator<Person> ageComparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());

        people.sort(nameComparator);

        System.out.println("Сортировка по имени:");
        people.forEach(Main::printPersonInfo);

        System.out.println();

        people.sort(ageComparator);

        System.out.println("Сортировка по возрасту:");
        people.forEach(Main::printPersonInfo);
    }

    private static void printPersonInfo(Person person) {
        System.out.println("Имя: " + person.getName() + ", Возраст: " + person.getAge());
    }
}