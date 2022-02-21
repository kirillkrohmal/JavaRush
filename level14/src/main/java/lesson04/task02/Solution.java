package lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Коты
1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
2. Каждый параметр соответствует имени кота.
Для каждого параметра:
3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
4. Вывести на экран cat.toString().
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //Add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;


            return cat;
        }
    }

    static class Cat {
        private String name;


    }

    static class MaleCat extends Cat {

    }

    static class FemaleCat extends Cat {

    }
}
