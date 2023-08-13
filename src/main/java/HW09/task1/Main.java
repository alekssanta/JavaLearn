package HW09.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Map<String, String>> mp = new HashMap<>();

        mp.put("key1", new HashMap<>(){{
            put("Art1", "100");
            put("Max1", "200");
        }});

        mp.put("key2", new HashMap<>(){{
            put("Rita2", "300");
            put("Sasha2", "400");
            put("Igor2", "500");
        }});

        List<Object[]> resultList = new ArrayList<>();

        for (Map.Entry<String, Map<String, String>> entry : mp.entrySet()) {
            String mainKey = entry.getKey();
            Map<String, String> innerMap = entry.getValue();

            for (Map.Entry<String, String> innerEntry : innerMap.entrySet()) {
                String innerKey = innerEntry.getKey();
                String innerValue = innerEntry.getValue();

                Object[] result = {mainKey, innerKey, innerValue};
                resultList.add(result);
            }
        }

        for (Object[] result : resultList) {
            System.out.println(result[0] + ", " + result[1] + ", " + result[2]);
        }
    }
}