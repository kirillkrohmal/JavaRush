package lesson18.big01;

public class Field {
    int width;
    int height;
    int[][] matrix;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new int[height][width];
    }

    public void print() {

    }

    public void removeFullLines() {

    }

    public Integer getValue(int x, int y) {

        return null;
    }

    public void setValue(int x, int y, int value) {

    }


    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
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
}
