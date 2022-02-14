package lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/


public class Solution {
    public static void main(String[] args) {
        //add your code here
        Cat cat1 = new Cat("Vasya", 10, 4, 56);
        Cat cat2 = new Cat("Ivan", 7, 3, 60);
        Cat cat3 = new Cat("Petya", 5, 5, 67);

    }

    public static class Cat {
        static String name;
        static int age;
        static int weight;
        static int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
