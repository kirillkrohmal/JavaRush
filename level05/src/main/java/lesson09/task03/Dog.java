package lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog {
    //Напишите тут ваш код
    String name;
    int height;
    int color;

    public Dog (String name) {
        this.name = name;
    }

    public Dog (String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Dog (String name, int height, int color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
