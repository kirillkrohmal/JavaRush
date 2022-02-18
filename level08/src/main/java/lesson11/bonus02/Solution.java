package lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String, String> map = new HashMap<>();

        while(true) {
            String townName = reader.readLine();

            if (townName.isEmpty()) break;
            String familyName = reader.readLine();

            map.put(townName, familyName);
        }

        String currentTown = reader.readLine();
        for (Map.Entry<String, String> stringEntry : map.entrySet()) {
            if (currentTown.equals(stringEntry.getKey())) {
                System.out.println(stringEntry.getValue());
            } else continue;
        }
    }
}
