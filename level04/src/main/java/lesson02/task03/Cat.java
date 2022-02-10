package lesson02.task03;

/* Реализовать метод setCatsCount
Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать значение переменной
catsCount равное переданному параметру.
*/

public class Cat {

    private int catsCount = 0;

    public static void setCatsCount(int catsCount)
    {
        Cat cat = new Cat();
        cat.catsCount = catsCount;
    }
}
