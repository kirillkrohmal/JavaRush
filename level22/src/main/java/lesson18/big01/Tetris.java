package lesson18.big01;

public class Tetris {
    private Field field;
    private Figure figure;
    public static Tetris game;

    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public void run() {

    }

    public void step() {

    }

    public static Tetris game() {

        return null;
    }
}
