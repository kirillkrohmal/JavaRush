package lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Cat cat1 = new Cat("Vasya", 10, 4, 56);
        Cat cat2 = new Cat("Ivan", 7, 3, 60);
        Cat cat3 = new Cat("Petya", 5, 5, 67);


        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat1.fight(cat3));
    }

    public static class Cat {
        public static int fightCount = 0;
        public static int count = 0;

        static String name;
        static int age;
        static int weight;
        static int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int age = this.age > anotherCat.age ? 1 : 0;
            int weight = this.weight > anotherCat.weight ? 1 : 0;
            int strength = this.strength > anotherCat.strength ? 1 : 0;

            int score = age + weight + strength;

            return score > 2;
        }
    }
}
