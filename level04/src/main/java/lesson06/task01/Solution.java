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
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String number1 = reader.readLine ();

        int one = Integer.parseInt (number1);
        int x;
        String number2 = reader.readLine();

        int two = Integer.parseInt (number2);

        if (one < two) {
            x = one;
        } else
            x = two;
        System.out.println (x);
    }
}