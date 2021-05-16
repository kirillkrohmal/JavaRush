package lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

        String number1 = reader.readLine ();
        String number2 = reader.readLine ();
        String number3 = reader.readLine ();
        String number4 = reader.readLine ();

        int x;

        int one = Integer.parseInt (number1);
        int two = Integer.parseInt (number2);
        int three = Integer.parseInt (number3);
        int four = Integer.parseInt (number4);

        if (one > two & one > three & one > four) {
            System.out.println(one);
        } else if (two > three & two > one & two > four) {
            System.out.println (two);
        } else if (three > two & three > one & three > four){
            System.out.println (three);
        } else if (four > two & four > one & four > three){
            System.out.println (four);
        }
    }
}
