package com.javarush.test.level24.lesson14.big01;

import lesson14.big01.com.javarush.test.level24.lesson14.big01.*;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * Главный класс игры
 */
public class Arcanoid
{
    //ширина и высота
    private int width;
    private int height;

    //список кирпичей
    private ArrayList<Brick> bricks = new ArrayList<Brick>();
    //шарик
    private Ball ball;
    //подставка
    private Stand stand;

    //игра закончена?
    private boolean isGameOver = false;

    public Arcanoid(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public ArrayList<Brick> getBricks()
    {
        return bricks;
    }

    public Ball getBall()
    {
        return ball;
    }

    public void setBall(Ball ball)
    {
        this.ball = ball;
    }

    public Stand getStand()
    {
        return stand;
    }

    public void setStand(Stand stand)
    {
        this.stand = stand;
    }

    /**
     * Рисуем на холсте границы и все объекты.
     */
    public void draw(Canvas canvas)
    {
        //отрисуй границы
        //отрисуй кирпичи
        //отрисуй шарик
        //отрисуй подставку
        drawBoders(canvas);
        for (Brick brick : bricks) {
            brick.draw(canvas);
        }
        ball.draw(canvas);
        stand.draw(canvas);

    }

    /**
     * Рисуем на холсте границы
     */
    private void drawBoders(Canvas canvas)
    {
        //draw game
        for (int i = 0; i < width + 2; i++)
        {
            for (int j = 0; j < height + 2; j++)
            {
                canvas.setPoint(i, j, '.');
            }
        }

        for (int i = 0; i < width + 2; i++)
        {
            canvas.setPoint(i, 0, '-');
            canvas.setPoint(i, height + 1, '-');
        }

        for (int i = 0; i < height + 2; i++)
        {
            canvas.setPoint(0, i, '|');
            canvas.setPoint(width + 1, i, '|');
        }
    }

    /**
     *  Основной цикл программы.
     *  Тут происходят все важные действия
     */
    public void run() throws Exception
    {
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

    /**
     * Двигаем шарик и подставку.
     */
    public void move()
    {
        //двигай шарик
        //двигай подставку
        ball.move();
        stand.move();
    }

    /**
     * Проверяем столкновение с кирпичами.
     * Если столкновение было - шарик отлетает в случайном направлении 0..360 градусов
     */
    public void checkBricksBump()
    {
        //Тут проверь - столкнулся ли шарик с кирпичем.
        //Если да - кирпичь удалить, а шарик запустить в случайно направлении.
        Brick br = null;
        for (Brick brick : bricks) {
            if (ball.isIntersec(brick) == true) {
                double angel = Math.random() * 360;
                ball.setDirection(angel);
                br = brick;
                break;
            }
        }
        if (br != null) bricks.remove(br);
    }

    /**
     * Проверяем столкновение с подставкой.
     * Если столкновение было - шарик отлетает в случайном направлении  вверх 80..100 градусов.
     */
    public void checkStandBump()
    {
        //Тут проверь - столкнулся ли шарик с подставкой.
        //Если да - запустить шарик  вверх на 80..100 градусов.
        if (ball.isIntersec(stand) == true) {
            double angel = 80 + Math.random()*20;
            ball.setDirection(angel);
        }
    }




    /**
     * Проверяем - не улетел ли шарик через дно.
     * Если да - игра окончена (isGameOver = true)
     */
    public void checkEndGame()
    {
        //Если шарик улетел за нижнюю границы - игра окончена.
        if (ball.getY() > getHeight()) {
            isGameOver = true;
        }
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public static Arcanoid game;

    public static void main(String[] args) throws Exception
    {
        // создание игры размером 20(ширина)х30(высота)
        game = new Arcanoid(20, 30);
        // создание мяча с координатой х - 10, у - 29; скорость - 2; направление - 95.
        Ball ball = new Ball(10, 29, 2,  95);
        // приваиваем данные значения мяча
        game.setBall(ball);
        // создание подставки с координатой х = 10, у - 30
        Stand stand = new Stand(10, 30);
        // присваивает данные значения подставки
        game.setStand(stand);
        // добавляем кирпичи с соотвествующими координатами
        game.getBricks().add(new Brick(3, 3));
        game.getBricks().add(new Brick(7, 5));
        game.getBricks().add(new Brick(12, 5));
        game.getBricks().add(new Brick(16, 3));
        // запустаем игру (переходим в метод run)
        game.run();
    }
}



















