package HW09.task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("Astra", "Gorod Moskva", "River", "Ruslan", "Albatross");
        Map<Character, String> map = new HashMap<>();

        for (String string : strings) {
            char firstLetter = string.charAt(0);
            if (map.containsKey(firstLetter)) {
                String currentMaxString = map.get(firstLetter);
                if (string.length() > currentMaxString.length() && string.length() <= 10) {
                    map.put(firstLetter, string);
                }
            } else {
                if (string.length() <= 10) {
                    map.put(firstLetter, string);
                }
            }
        }

        for (Map.Entry<Character, String> entry : map.entrySet()) {
            System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
        }
    }
}
