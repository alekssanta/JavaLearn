package HW08.task6;

//6)      Пользовательский функциональный интерфейс
//        Напишите собственный функциональный интерфейс ThreeFunction (он принимает три аргумента и выдает результат).
//        Реализуйте это с помощью двух разных лямбда()
//        Предоставьте код с использованием этих лямбда

public class Main {
    public static void main(String[] args) {
        // Лямбда-выражение для сложения трех чисел
        ThreeFunction<Integer, Integer, Integer, Integer> addThreeNumbers = (a, b, c) -> a + b + c;

        // Лямбда-выражение для объединения трех строк
        ThreeFunction<String, String, String, String> concatenateThreeStrings = (s1, s2, s3) -> s1 + s2 + s3;

        // Пример использования лямбда-выражения для сложения трех чисел
        int sum = addThreeNumbers.apply(1, 2, 3);
        System.out.println("Сумма трех чисел: " + sum);

        // Пример использования лямбда-выражения для объединения трех строк
        String result = concatenateThreeStrings.apply("I ", "love ", "Apple!");
        System.out.println("Результат объединения трех строк: " + result);
    }
}
