package lesson03.task05;

import java.util.HashMap;
import java.util.Map;

/* Вывести на экран список значений
Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        //напишите тут ваш код
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
