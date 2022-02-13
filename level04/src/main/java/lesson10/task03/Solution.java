package lesson10.task03;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String р = bufferedReader.readLine();
        String second1 = bufferedReader.readLine();
        int N = Integer.parseInt(second1);

        int i = 0;
        while(i < N) {
            System.out.println(р);
            i++;
        }
    }
}
