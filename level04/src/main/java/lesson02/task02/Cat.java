package lesson02.task02;

/* Реализовать метод addNewCat
Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
*/

public class Cat {


    static int catsCount = 1;

    public static void addNewCat() {
        //add your code here
        Cat.catsCount++;
    }
}
