package lesson14.big01.com.javarush.test.level24.lesson14.big01;

import java.util.ArrayList;

public class Arcanoid {
    public static void main(String[] args) {

    }

    int width;
    int height;
    Ball ball;
    Stand stand;
    ArrayList<Brick> bricks;
    public static Arcanoid game;

    public Arcanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public ArrayList<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(ArrayList<Brick> bricks) {
        this.bricks = bricks;
    }

   void run() {

   }

    void move() {

    }

    void draw() {

    }
}
