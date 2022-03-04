package lesson13.big01;

public class Room {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
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

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void run() {

    }

    public void print() {

    }

    public static Room game;

    public static void main(String[] args) {
        game = new Room(20, 20, new Snake(5, 5));
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
    }

    private void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse(x, y);
    }

    public void eatMouse() {
        createMouse();
    }

    private static int[] levelDelay = {1000, 600, 550, 500, 480, 460, 440, 420, 400, 380, 360, 340, 320, 300, 285, 270};


    public void sleep() {
        try {
            int level = snake.getSections().size();
            int delay = level < 15 ? levelDelay[level] : 250;

            Thread.sleep(delay);
        } catch (InterruptedException e) {
        }
    }
}
