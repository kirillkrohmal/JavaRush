package lesson16.big01;

import java.util.ArrayList;

public class Space {
    private int width;
    private int height;

    private SpaceShip ship;
    private ArrayList<Ufo> ufos = new ArrayList<Ufo>();
    private ArrayList<Rocket> rockets = new ArrayList<Rocket>();
    private ArrayList<Bomb> bombs = new ArrayList<Bomb>();

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public SpaceShip getShip() {
        return ship;
    }

    public ArrayList<Ufo> getUfos() {
        return ufos;
    }

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }
}
