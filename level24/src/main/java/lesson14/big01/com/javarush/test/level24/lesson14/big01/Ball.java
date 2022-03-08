package lesson14.big01.com.javarush.test.level24.lesson14.big01;

public class Ball extends BaseObject {
    private double speed;
    private double direction;

    private double dx;
    private double dy;

    private boolean isFrozen;


    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public void setFrozen(boolean frozen) {
        isFrozen = frozen;
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {

    }


}
