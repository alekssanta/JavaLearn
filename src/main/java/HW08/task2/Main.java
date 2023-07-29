package HW08.task2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//2) Реализовать TreeMap<String> с кастомным компаратором	сравнивать должен по
//        следующему приниципу Строка считается больше другой, если у нее длина больше,
//        в случае одинаковой длины классическое упорядочивание по алфавитному принципу

public class Main {
    public static void main(String[] args) {
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                int lengthComparison = Integer.compare(str1.length(), str2.length());

                if (lengthComparison == 0) {
                    return str1.compareTo(str2);
                }

                return lengthComparison;
            }
        };

        TreeMap<String, Integer> treeMap = new TreeMap<>(customComparator);

        treeMap.put("динозавр", 1);
        treeMap.put("попугай", 2);
        treeMap.put("кошка", 3);
        treeMap.put("собака", 4);
        treeMap.put("слон", 5);

        for (String key : treeMap.keySet()) {
            System.out.println(key + " : " + treeMap.get(key));
        }
    }
}
