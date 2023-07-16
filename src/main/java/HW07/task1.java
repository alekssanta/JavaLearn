package HW07;

import java.util.Arrays;

public class task1 {
//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
public static <T> void swapElements(T[] array, int index1, int index2) {
    T temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
}

    public static void main(String[] args) {
        String[] numbers = {"01", "02", "03"};
        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        swapElements(numbers, 0, 2);
        System.out.println("Массив после замены элементов: " + Arrays.toString(numbers));
    }

}
