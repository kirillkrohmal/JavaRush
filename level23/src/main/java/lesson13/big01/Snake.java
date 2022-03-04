package lesson13.big01;

import java.util.ArrayList;

public class Snake {

    private ArrayList<SnakeSection> sections = new ArrayList<SnakeSection>();
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
        sections = new ArrayList<SnakeSection>();
        sections.add(new SnakeSection(x, y));
        isAlive = true;
    }

    public void move() {

    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public ArrayList<SnakeSection> getSections() {
        return sections;
    }

    public void setSections(ArrayList<SnakeSection> sections) {
        this.sections = sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }
}
