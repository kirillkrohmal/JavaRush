package lesson05.task04;

/* Cчётчик котов
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов
(статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
*/

public class Cat {
    //Напишите тут ваш код
    String name;            //обычная переменная
    static int catCount;    //статическая переменная

    Cat(String name) {
        this.name = name;
        Cat.catCount++;   //увеличиваем значение статический переменной на 1
    }

    protected void finalize()throws Throwable {
        catCount--;
    }

    public static void main(String[] args) {

    }
}
