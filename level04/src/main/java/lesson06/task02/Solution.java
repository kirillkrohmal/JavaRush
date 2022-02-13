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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String second1 = bufferedReader.readLine();
        String second2 = bufferedReader.readLine();
        String second3 = bufferedReader.readLine();
        String second4 = bufferedReader.readLine();

        int one = Integer.parseInt(second1);
        int two = Integer.parseInt(second2);
        int three = Integer.parseInt(second3);
        int four = Integer.parseInt(second4);


        if (one > two && one > three && one > four) {
            System.out.println(one);
        } else if (two > one && two > three && two > four) {
            System.out.println(two);
        } else if (three > two && three > one && three > four) {
            System.out.println(three);
        } else if (four > two && four > three && four > one) {
            System.out.println(four);
        }
    }
}
