package lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> list = getIntegerList();
        System.out.println(getMinimum(list));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум
        int min = array.get(0);

        for (Integer integer : array) {
            if (integer < min)
                min = integer;
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //Тут создать и заполнить список
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        List<Integer> list = new LinkedList<>();

        for (; N > 0; N--) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        return list;
    }
}
