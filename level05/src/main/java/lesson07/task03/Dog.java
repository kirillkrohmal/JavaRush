package lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog {
    //Напишите тут ваш код
    String name;
    int height;
    int color;

    public void initialize (String name, int height) {
        this.name = name;
        this.height = height;
    }
    public void initialize (String name, int height, int color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
