 package lesson11.home10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Пять наибольших чисел
Создать список целых чисел. Ввести с клавиатуры 20 целых чисел. Создать метод по безопасному извлечения чисел из списка:
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
Метод должен возвращать элемент списка (list) по его индексу (index). Если в процессе получения элемента возникло исключение, его нужно перехватить, и метод должен вернуть defaultValue.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
      //напишите тут ваш код

        return index;
    }
}
