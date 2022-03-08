package lesson14.big01.com.javarush.test.level24.lesson14.big01;

public class Stand  extends BaseObject {

    private static int[][] matrix = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    public Stand(double x, double y)
    {
        super(x,y,3);
        speed = 1;
        direction = 0;
    }

    private double speed = 1;
    private double direction = 0;

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {

    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

}
