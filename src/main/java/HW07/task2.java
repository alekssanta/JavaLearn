package HW07;
//2. Написать метод, который преобразует массив в ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    public static <T> List<T> arrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        String[] numbers = {"01", "02", "03"};
        List<String> nameList = arrayToList(numbers);
        System.out.println("Результат: " + nameList);
    }

}
