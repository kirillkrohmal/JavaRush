package lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        Scanner sr = new Scanner(System.in);

        System.out.print("Введите челое число -> ");

        if(sr.hasNextInt()) {
            int number = sr.nextInt();
            String category = (number % 2) == 0 ? "Четное" : "Нечетное";

            System.out.println(category + " число: " + number);
        } else {
            System.out.println("Не целое число");
        }
    }
}


