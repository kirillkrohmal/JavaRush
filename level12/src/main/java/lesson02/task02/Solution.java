package lesson02.task02;

/* Ничего не выводится на экран
Переопределить метод getName в классе Whale(Кит), чтобы программа ничего не выдавала на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName()
        {
            return "";
        }
    }

    public static class Whale extends Cow {

    }
}
