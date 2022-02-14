package lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle {
    //Напишите тут ваш код
    public int rectangletop;
    public int rectangleleft;
    public int rectanglewidth;
    public int rectangleheight;

    public Rectangle (int top, int left, int width, int height) {
        this.rectangletop = top;
        this.rectangleleft = left;
        this.rectanglewidth = width;
        this.rectangleheight = height;
    }
    public Rectangle (int top, int left) {
        this.rectangletop = top;
        this.rectangleleft = left;
    }
    public Rectangle (int top, int left, int width) {
        this.rectangletop = top;
        this.rectangleleft = left;
        this.rectanglewidth = width;
    }
    public Rectangle (Rectangle anotherRectangle) {
        this.rectangletop = anotherRectangle.rectangletop;
        this.rectangleleft =anotherRectangle.rectangleleft;
        this.rectanglewidth = anotherRectangle.rectanglewidth;
        this.rectangleheight = anotherRectangle.rectangleheight;
    }
}
