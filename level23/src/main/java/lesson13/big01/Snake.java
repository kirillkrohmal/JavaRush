package lesson13.big01;

import java.util.ArrayList;

public class Snake {

    private ArrayList<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public ArrayList<SnakeSection> getSections() {
        return sections;
    }

    public void setSections(ArrayList<SnakeSection> sections) {
        this.sections = sections;
    }

    public boolean isValue() {
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
