package HW08.task5;

//5)      Реализуйте каждый из основных функциональных интерфейсов Java Standard Library (поставщик, предикат и т.д.) с помощью лямбда-выражений.
//        Создайте собственный функциональный интерфейс и добавьте несколько реализаций, используя как лямбда-выражения, так и анонимные классы,

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello, World!";
        System.out.println(supplier.get());

        Predicate<Integer> predicate = num -> num > 0;
        System.out.println(predicate.test(5));

        Function<Integer, String> function = num -> "Number: " + num;
        System.out.println(function.apply(666));

        Consumer<String> consumer = str -> System.out.println("Received: " + str);
        consumer.accept("Hello!");

        UnaryOperator<Integer> unaryOperator = num -> num * num;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 + num2;
        System.out.println(binaryOperator.apply(2, 3));

        MyFunctionalInterface myFunctionalInterface = str -> System.out.println("Custom: " + str);
        myFunctionalInterface.doSomething("Hello, Custom!");

        MyFunctionalInterface convertedLambda = new MyFunctionalInterface() {
            @Override
            public void doSomething(String str) {
                System.out.println("Converted Lambda: " + str);
            }
        };
        convertedLambda.doSomething("Hello, Converted Lambda!");
    }
}
