package lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
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
        int second2 = Integer.parseInt(bufferedReader.readLine());

        if (second2 < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
