package lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String second1 = bufferedReader.readLine();
        String second2 = bufferedReader.readLine();

        int one = Integer.parseInt(second1);
        int two = Integer.parseInt(second2);

        int m = 2;
        int n = 4;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

            }
        }
    }
}
