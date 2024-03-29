package lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minimum) {
                minimum = array[i];
            }
        }

        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maximum) {
                maximum = array[i];
            }
        }

    }
}
