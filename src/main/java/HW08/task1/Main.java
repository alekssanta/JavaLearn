package HW08.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//1) Сравнение работы LinkedList и ArrayList
//        Сгенерить список размером 10 000 LinkedList и ArrayList
//
//        а) вставляем 1000 элементов в начало списка, сравниваем скорость
//        б) вставляем 1000 элементов в конец списка, сравниваем скорость
//        в) вставляем 1000 элементов в середину списка, сравниваем скорость
//        г) 1000 раз запрашиваем рандомный элемент из списка сравниваем скорость

public class Main {
    public static void main(String[] args) {
        int listSize = 10000;
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, i);
        }
        long linkedListInsertionTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, i);
        }
        long arrayListInsertionTime = System.nanoTime() - startTime;

        System.out.println("Вставка 1000 элементов в начало списка:");
        System.out.println("LinkedList: " + linkedListInsertionTime + " наносекунд");
        System.out.println("ArrayList: " + arrayListInsertionTime + " наносекунд");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        linkedListInsertionTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        arrayListInsertionTime = System.nanoTime() - startTime;

        System.out.println("Вставка 1000 элементов в конец списка:");
        System.out.println("LinkedList: " + linkedListInsertionTime + " наносекунд");
        System.out.println("ArrayList: " + arrayListInsertionTime + " наносекунд");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(listSize / 2, i);
        }
        linkedListInsertionTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(listSize / 2, i);
        }
        arrayListInsertionTime = System.nanoTime() - startTime;

        System.out.println("Вставка 1000 элементов в середину списка:");
        System.out.println("LinkedList: " + linkedListInsertionTime + " наносекунд");
        System.out.println("ArrayList: " + arrayListInsertionTime + " наносекунд");

        Random random = new Random();
        int randomIndex = random.nextInt(listSize);

        startTime = System.nanoTime();
        linkedList.get(randomIndex);
        long linkedListGetTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        arrayList.get(randomIndex);
        long arrayListGetTime = System.nanoTime() - startTime;

        System.out.println("Запрос рандомного элемента из списка:");
        System.out.println("LinkedList: " + linkedListGetTime + " наносекунд");
        System.out.println("ArrayList: " + arrayListGetTime + " наносекунд");
    }
}
