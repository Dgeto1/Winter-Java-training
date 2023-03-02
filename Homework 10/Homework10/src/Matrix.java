import java.util.Random;

public class Matrix {
    private int[][] matrix;
    public Matrix(int cols, int rows) {
       matrix = new int[cols][rows];
    }

    public Matrix(int cols, int rows, int defaultValue) {
        this(rows, cols);
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = defaultValue;
            }
        }
    }

    public void set(int x, int y, int value) {
        matrix[x][y] = value;
    }

    public int get(int x, int y) {
        return matrix[x][y];
    }
}
