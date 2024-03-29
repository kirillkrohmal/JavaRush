package lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка  с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3,
потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listAliquot3 = new ArrayList<Integer>();
        ArrayList<Integer> listAliquot2 = new ArrayList<Integer>();
        ArrayList<Integer> listOther = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            list.add(Integer.valueOf(s));
        }

        for (Integer integer : list) {
            if ((integer%2==0 && integer%3==0)) {
                listAliquot2.add(integer);
                listAliquot3.add(integer);
            } else if(integer%3==0) {
                listAliquot3.add(integer);
            } else if(integer%2==0) {
                listAliquot2.add(integer);
            } else {
                listOther.add(integer);
            }
        }
        printList(listAliquot3);
        printList(listAliquot2);
        printList(listOther);
    }
    

    public static void printList(List<Integer> list) {
        //add your code here
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
