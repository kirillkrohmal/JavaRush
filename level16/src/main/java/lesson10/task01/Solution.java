package lesson10.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

/* Считаем секунды
1. Напиши реализацию метода run в нити Stopwatch (секундомер).
2. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
3. Выведи количество секунд в консоль.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            Thread current = Thread.currentThread();
            try {
                //add your code here - добавьте код тут
                while(!current.isInterrupted()) {
                    seconds += 1;
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println(seconds);
            }
        }
    }
}

