package lesson14.big01.com.javarush.test.level24.lesson14.big01;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Arcanoid {
    public static void main(String[] args) throws Exception {
        game = new Arcanoid(20, 30);
        Ball ball = new Ball(10, 29, 2,  95);

        game.setBall(ball);

        Stand stand = new Stand(10, 30);

        game.setStand(stand);

        game.getBricks().add(new Brick(3, 3));
        game.getBricks().add(new Brick(7, 5));
        game.getBricks().add(new Brick(12, 5));
        game.getBricks().add(new Brick(16, 3));

        game.run();
    }

    int width;
    int height;
    Ball ball;
    Stand stand;
    ArrayList<Brick> bricks = new ArrayList<Brick>();;
    public static Arcanoid game;
    private boolean isGameOver = false;

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

    public void run() throws Exception {
        //Создаем холст для отрисовки.
        Canvas canvas = new Canvas(width, height);

        //Создаем объект "наблюдатель за клавиатурой" и стартуем его.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //Исполняем цикл, пока игра не окончека
        while (!isGameOver)
        {
            //"наблюдатель" содержит события о нажатии клавиш?
            if (keyboardObserver.hasKeyEvents())
            {
                KeyEvent event = keyboardObserver.getEventFromTop();

                //Если "стрелка влево" - сдвинуть фигурку влево
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    stand.moveLeft();
                    //Если "стрелка вправо" - сдвинуть фигурку вправо
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    stand.moveRight();
                    //Если "пробел" - запускаем шарик
                else if (event.getKeyCode() == KeyEvent.VK_SPACE)
                    ball.start();
            }

            //двигаем все объекты
            move();

            //проверяем столкновения
            checkBricksBump();
            checkStandBump();

            //проверяем, что шарик мог улететь через дно.
            checkEndGame();

            //отрисовываем все объекты
            canvas.clear();
            draw(canvas);
            canvas.print();

            //пауза
            Thread.sleep(300);
        }

        //Выводим сообщение "Game Over"
        System.out.println("Game Over!");
    }

    public void checkBricksBump() {

    }

    public void checkStandBump() {

    }
    public void checkEndGame() {

    }

    void move() {
        ball.move();
        stand.move();
    }

    void draw(Canvas canvas) {
        drawBoders(canvas);
        for (Brick brick : bricks) {
            brick.draw(canvas);
        }

        ball.draw(canvas);
        stand.draw(canvas);
    }

    private void drawBoders(Canvas canvas) {
        for (int i = 0; i < width + 2; i++) {
            for (int j = 0; j < height + 2; j++) {
                canvas.setPoint(i, j, '.');
            }
        }

        for (int i = 0; i < width + 2; i++) {
            canvas.setPoint(i, 0, '-');
            canvas.setPoint(i, height + 1, '-' );
        }

        for (int i = 0; i < height + 2; i++) {
            canvas.setPoint(0, i, '|');
            canvas.setPoint(width + 1, i, '|');
        }
    }
}
