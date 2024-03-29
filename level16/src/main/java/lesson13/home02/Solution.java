package lesson13.home02;

/* Последовательные выполнения нитей
1. В методе run после всех действий поставь задержку в 10 миллисекунд. Выведи "Нить прервана",
если нить будет прервана.
2. Сделай так, чтобы все нити выполнялись последовательно: сначала для нити №1 отсчет с COUNT до 1,
потом для нити №2 с COUNT до 1 и т.д.
Пример:
#1: 4
#1: 3
...
#1: 1
#2: 4
...
*/

public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        //напишите тут ваш код
        for (int j = 0; j < COUNT; j++) {
            Thread thread = new SleepingThread();
            thread.join();
        }
    }


    public static class SleepingThread extends Thread {
        private volatile int countDownIndex = COUNT;
        private static volatile int threadCount = 0;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            try
            {
                while (true)
                {
                    System.out.println(this);
                    if (--countDownIndex == 0) return;
                    //add sleep here - добавь sleep тут
                    Thread.sleep(10);
                }
            }
            catch (InterruptedException e) {
                System.out.println("Нить прервана");
            }

        }

        public String toString() {
            return "#" + getName() + ": " + countDownIndex;
        }
    }
}
