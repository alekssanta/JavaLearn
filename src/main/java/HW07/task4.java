package HW07;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class task4 {
    public static void main(String[] args) {
        String[] words = {"яблоко", "банан", "груша", "яблоко", "киви", "яблоня", "авокадо", "яблоко", "киви", "манго"};

        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Список уникальных слов:");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }

        System.out.println("Количество повторений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}