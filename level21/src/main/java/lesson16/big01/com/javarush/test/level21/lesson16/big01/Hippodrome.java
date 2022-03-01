package lesson16.big01.com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by IGOR on 14.11.2015.
 */
public class Hippodrome
{
    public static ArrayList<Horse> horses = new ArrayList<Horse>();
    public static Hippodrome game;



    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome();
        game.getHorses().add(new Horse("Horse1", 3, 0));
        game.getHorses().add(new Horse("Horse2", 3, 0));
        game.getHorses().add(new Horse("Horse3", 3, 0));


    }

    public static Hippodrome getGame() {
        return game;
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void move() {

    }

    public void print() {

    }

    public void run() {

    }
}
