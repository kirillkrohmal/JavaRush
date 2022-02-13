package lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        int one = Integer.parseInt(second1);
        int two = Integer.parseInt(second2);
        int three = Integer.parseInt(second3);

        int max;
        int min;
        int mid = 0;

        if (one >= two && one >= three && two >= three) {
            System.out.println(one + " " + two + " " + three);
        }
        else if (two >= one && two >= three && three >= two) {
            System.out.println(two + " " + one + " " + three);

        } else {
            System.out.println(two + " " + one + " " + three);
        }
    }
}


