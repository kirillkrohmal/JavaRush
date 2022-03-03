package lesson18.big01;

public class Figure {
    int x;
    int y;
    int[][] matrix;


    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void left() {
        x--;
        if (!isCurrentPositionAvailable()) {
            x++;
        }
    }

    public void right() {
        x++;
        if (!isCurrentPositionAvailable()) {
            x--;
        }
    }

    public void down() {
        y--;
    }

    public void up() {
        y++;
    }

    public void downMaximum()
    {
        while (isCurrentPositionAvailable())
        {
            y++;
        }

        y--;
    }

    public void rotate() {
        int[][] matrix2 = new int[3][3];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matrix2[i][j] = matrix[j][i];
            }
        }

        matrix = matrix2;
    }

    public boolean isCurrentPositionAvailable() {

        Field field = Tetris.game.getField();

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (matrix[i][j] == 1)
                {
                    if (y + i >= field.getHeight())
                        return false;

                    Integer value = field.getValue(x + j, y + i);
                    if (value == null || value == 1)
                        return false;
                }
            }
        }

        return true;
    }

    public void landed() {
        Field field = Tetris.game.getField();

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (matrix[i][j] == 1)
                    field.setValue(x + j, y + i, 1);
            }
        }
    }
}

