package lesson16.big01;

public class BaseObject {

    protected double x;
    protected double y;
    protected double radius;
    private boolean isAlive;

    public BaseObject(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isAlive = true;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }


    public boolean isAlive()
    {
        return isAlive;
    }

    public void setAlive(boolean alive)
    {
        isAlive = alive;
    }

    public void die()
    {
        isAlive = false;
    }

    public void draw(Canvas canvas)
    {
        //do nothing
    }

    public void move()
    {
        //do nothing
    }

    public boolean isIntersec(BaseObject o) {
        double dx = x - o.x;
        double dy = y - o.y;
        double destination = Math.sqrt(dx * dx + dy * dy);
        double destination2 = Math.max(radius, o.radius);
        return destination <= destination2;
    }
}
