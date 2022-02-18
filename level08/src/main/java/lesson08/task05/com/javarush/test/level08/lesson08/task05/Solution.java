package lesson08.task05.com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "Oleg");
        map.put("B", "Sasha");
        map.put("C", "Andrey");
        map.put("D", "Kolya");
        map.put("E", "Vasya");
        map.put("F", "Petya");
        map.put("G", "Andrey");
        map.put("H", "Oleg");
        map.put("I", "Sasha");
        map.put("J", "Andrey");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>(map);

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            int count = 0;

            for (Map.Entry<String, String> stringEntry : hashMap.entrySet()) {
                if (entry.getValue().equals(stringEntry.getValue())) {
                    count++;
                }
            } if (count > 1) {
                removeItemFromMapByValue(map, entry.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> element = new HashMap<>(map);

        for (Map.Entry<String, String> entry : element.entrySet()) {
            if (entry.getValue().equals(value)) {
                map.remove(entry.getKey());
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
