package lesson11.home08;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] list = createList();
        printList(list);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add("text1");
        list2.add("text2");

        ArrayList<String>[] list3 = new ArrayList[2];
        list3[0] = list;
        list3[1] = list2;

        return list3;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> arrayList : arrayOfStringList) {
            for (String s : arrayList) {
                System.out.println(s);
            }
        }
    }
}