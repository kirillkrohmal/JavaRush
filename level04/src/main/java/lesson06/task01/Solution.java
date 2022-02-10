package lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String one1 = bufferedReader.readLine();
        String two2 = bufferedReader.readLine();

        int one = Integer.parseInt(one1);
        int two = Integer.parseInt(two2);

        int x;

        if (one < two) {
            x = one;
        } else
            x = two;
        System.out.println (x);
    }
}