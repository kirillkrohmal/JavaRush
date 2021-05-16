package lesson10.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 10 чисел
Вывести на экран числа от 1 до 10 используя цикл while.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        int x = 10;
        int num = 0;

        while (num < x) {
            num++;
            System.out.println (num);
        }
    }
}