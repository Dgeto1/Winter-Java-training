public class Matrix {
    private int[][] matrix;

    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
    }

    public Matrix(int rows, int columns, int defaultValue) {
        this(rows, columns);
        fill(defaultValue);
    }

    public void fill(int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
            }
        }
    }

    public void clear() {
        fill(0);
    }

    public int[] getRow(int row) {
        int rowLength = matrix[0].length;
        int[] arr = new int[rowLength];

        for (int col = 0; col < rowLength; col++) {
            arr[col] = matrix[row][col];
        }
        return arr;
    }

    public int[] getColumn(int col) {
        int[] arr = new int[matrix[col].length];
        for (int i = col - 1, k = 0; i < matrix[col].length; i++) {
            arr[k] = matrix[col][i];
            k++;
        }
        return arr;
    }

    private void isValidIndex(int x, int y) {
        if (!(x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length)) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void set(int x, int y, int value) {
        isValidIndex(x, y);
        matrix[x][y] = value;
    }

    public int get(int x, int y) {
        isValidIndex(x, y);
        return matrix[x][y];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sb.append(matrix[i][j] + " ");
            }
            sb.append("\n");
        }
        return sb.toString().trim();
    }

    public Matrix subMatrix(int x1, int y1, int x2, int y2) {
        Matrix subMatrix = new Matrix(1, 2);
        subMatrix.matrix[0][0] = matrix[x1][y1];
        subMatrix.matrix[0][1] = matrix[x2][y2];

        return subMatrix;
    }
}
