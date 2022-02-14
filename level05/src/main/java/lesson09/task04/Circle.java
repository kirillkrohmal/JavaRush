package lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle {
    //Напишите тут ваш код
    int centerX;
    int centerY;
    int radius;
    int wigth;
    int color;


    public Circle (int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public Circle (int centerX, int centerY, int radius, int wigth) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.wigth = wigth;
    }
    public Circle (int centerX, int centerY, int radius, int wigth, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.wigth = wigth;
        this.color = color;
    }
}
