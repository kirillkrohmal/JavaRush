package lesson06.task04;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    private static List fill(List list) {
        for (int i = 0; i < 11; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long  getTimeMsOfGet(List list) {
        //напишите тут ваш код
        Date currentTime = new Date();
        get10000(list);
        Date oldTime = new Date();
        long msDelay = oldTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is: " + msDelay + " in ms");
        return msDelay;
    }

    public static void get10000(List list) {
        if(list.isEmpty()) return;
            int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
