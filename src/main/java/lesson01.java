import java.util.Arrays;

public class lesson01 {
    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {

        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte aByte = 111;
        short aShort = 3333;
        int anInt = 2147483647;
        long aLong = 9223372036854775807L;
        float aFloat = 77.7f;
        double aDouble = 77.7777d;
        boolean aBoolean = true;
        char aChar = 'a';
        String string = "Text message";

//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        int a = 2, b = 3, c = 4, d = 5;
        System.out.println(calculateExpression(a, b, c, d)); // Выводит результат выражения
        //return aDouble;

       //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        System.out.println(isSumInRange(9, 999));
        System.out.println(isSumInRange(9, 9));

        //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        //System.out.println(checkNumber(0));
        checkNumber(0);
        checkNumber(9);
        checkNumber(-9);

        //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        System.out.println(isNegativeNumber(9));
        System.out.println(isNegativeNumber(-9));

        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    name("Волосимир");

    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        checkLeapYear(2024);
        checkLeapYear(2021);
        checkLeapYear(2000);
        checkLeapYear(1900); //не является високосным годом
        checkLeapYear(0); //null
        //дз - 2
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invert(arr);
        System.out.println(Arrays.toString(arr));
        //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int size = 8;
        int[] array = new int[size];
        for (int j = 0; j < size; j++) {
            array[j] = j * 3;
        }
        System.out.println(Arrays.toString(array)); //Вывод: [0, 3, 6, 9, 12, 15, 18, 21]

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] array3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int k = 0; k < array3.length; k++) {
            if (array3[k] < 6) {
                array3[k] *= 2;
            }
        }
        System.out.println(Arrays.toString(array3));
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] array4 = new int[5][5];
        for (int l = 0; l < array4.length; l++) {

        }
        for (int l = 0; l < array4.length; l++) {
            System.out.println(Arrays.toString(array4[l]));
        }
    }

    private static double calculateExpression(double a, double b, double c, double d) {
        return a * (b + c / d);
    }
    public static boolean isSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }
    public static void checkNumber(int i) {
        if (i >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }
    public static boolean isNegativeNumber(int i) {
        return i < 0;
    }
    public static void name(String name) {
        System.out.printf("Привет, %s!\n", name);
    }
    public static void checkLeapYear(int year) {
       if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }
    public static void invert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    }




