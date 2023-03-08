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

    public int[][] subMatrix(Range rows, Range cols) {
        int r = 0, c = 0;
        for(Integer num : rows) {
            r++;
        }
        for(Integer num : cols) {
            c++;
        }

        int[][] subMatrix = new int[r][c];
        for(int row = rows.getStart(), i=0; row <=rows.getEnd(); row++, i++) {
            for(int col = cols.getStart(), j=0; col <= cols.getEnd(); col++, j++) {
                subMatrix[i][j] = this.matrix[row][col];
            }
        }
        return subMatrix;
    }
}
