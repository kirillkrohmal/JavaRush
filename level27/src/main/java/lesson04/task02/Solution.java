package lesson04.task02;

/* Второй вариант дедлока
В методе secondMethod в синхронизированных блоках расставьте локи так,
чтобы при использовании класса Solution нитями образовывался дедлок
*/
public class Solution {
    private final Object lock = new Object();

    public synchronized void firstMethod() {
        {
            doSomething();
        }
    }

    public void secondMethod() {
          {
            {
                doSomething();
            }
        }
    }

    private void doSomething() {
    }
}