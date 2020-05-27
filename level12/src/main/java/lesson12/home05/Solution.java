package lesson12.home05;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное»
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
Замечание: постарайся определять тип животного как можно более точно.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o)
    {
        //напишите тут ваш код
        if (o instanceof Cat)
            return "Кот";
        if (o instanceof Tiger)
            return "Тигр";
        if (o instanceof Lion)
            return "Лев";
        if (o instanceof Bull)
            return "Бык";
        if (o instanceof Cow)
            return "Корова";
        if (o instanceof Animal)
            return "Животное";

        return "Животное";
    }

    public static class Cat  extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger
    {
    }

    public static class Lion
    {
    }

    public static class Bull  extends Animal
    {
    }

    public static class Cow  extends Animal
    {
    }

    public static class Animal
    {
    }
}
