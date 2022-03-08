package lesson14.big01.com.javarush.test.level24.lesson14.big01;

public class Canvas {
    private int width;
    private int height;

    char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height + 2][width + 2];
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

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    public void setPoint(double x, double y, char c) {
        int x0 = (int) Math.round(x);
        int y0 = (int) Math.round(y);

        if(y0 < 0 || y0 >= matrix.length) return;
        if (x0 < 0 || x0>= matrix[y0].length) return;

        matrix[y0][x0] = c;
    }

    public void drawMatrix(double x, double y, int[][] matrix, char c) {

    }

    public void clear() {
        this.matrix = new char[height + 2][width + 2];
    }


    public void print() {
        System.out.println();

        for (int i = 0; i < height + 2; i++) {
            for (int j = 0; j < width + 2; j++) {
                
            }
        }
    }
}
