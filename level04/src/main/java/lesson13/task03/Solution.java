package lesson13.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
/*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String second1 = bufferedReader.readLine();
        String second2 = bufferedReader.readLine();

        int m = Integer.parseInt(second1);
        int n = Integer.parseInt(second2);
*/
        int m = 10;
        int n = 10;

        for (int i = 1; i <= m; i++) {
            for (int j = i; j > n - i; j--) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
