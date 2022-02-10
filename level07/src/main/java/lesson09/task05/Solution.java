package lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        //read strings and init ArrayList list here - считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        ArrayList<String> list = new ArrayList<> ();

        for (int i = 0; i < 10; i++) {
            list.add (reader.readLine ());
        }
        ArrayList result = doubleValues (list);

        for (int i = 0; i < result.size (); i++) {
            System.out.println (result);
        }
        //print result - вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        // add your code here - добавь код тут
        ArrayList<String> list2 = new ArrayList<> ();

        for (int i = 0; i < list.size (); i++) {
            list2.add (list.get (i));
            list2.add (list.get (i));
        }
        return list2;
    }
}
