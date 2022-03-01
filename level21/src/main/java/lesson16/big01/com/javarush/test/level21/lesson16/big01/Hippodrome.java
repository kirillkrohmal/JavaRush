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


        game.run();
        game.printWinner();
    }

    public static Hippodrome getGame() {
        return game;
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void move() {
        for (Horse hors : horses) {
            hors.move();
        }
    }

    public void print() {
        for (Horse hors : horses) {
            hors.print();
        }
        System.out.println();
        System.out.println();
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public Horse getWinner() {

        Horse horse = horses.get(0);
        for (Horse hors : horses) {
            if (hors.getDistance() > horse.getDistance()) {
                horse = hors;
            }
        }

        return horse;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
