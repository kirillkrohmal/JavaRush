package lesson08.task01;

/* Класс Cat и статическая переменная catCount
Создать статическую переменную int catCount в классе Cat.
Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
*/

public class Cat {
    //Напишите тут ваш код
    static int catCount;
    public Cat() {
        catCount++;
    }
}
