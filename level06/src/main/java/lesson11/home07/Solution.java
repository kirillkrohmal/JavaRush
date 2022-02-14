package lesson11.home07;

import java.sql.Statement;
import java.util.ArrayList;

/* Три статические переменных name
Создай 3 public статических переменных: String Solution.name, String Cat.name, String Dog.name
*/

public class Solution {
    static String name;

    Solution(String name) {
        Solution.name = name;
    }
    public static class Cat {
        public static String name;
    }

    public static class Dog {
        public static String name;
    }
}
