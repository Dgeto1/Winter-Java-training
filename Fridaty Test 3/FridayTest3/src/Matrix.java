public class Matrix {
    private int[][] matrix;

    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public Matrix(int rows, int columns, int defaultValue) {
        this(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[rows][columns] = defaultValue;
            }
        }
    }

    public void fill(int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public int[] getRow(int row) {
        int[] arr = new int[matrix.length];
        for (int i = row - 1, k = 0; i < matrix.length; i++) {
            arr[k] = matrix[row][i];
            k++;
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

    private boolean isValidIndex(int x, int y) {
        return x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length;
    }

    public void set(int x, int y, int value) {
        if (isValidIndex(x, y)) {
            matrix[x][y] = value;
        }
    }

    public int get(int x, int y) {
        if (isValidIndex(x, y)) {
            return matrix[x][y];
        }
        return -1;
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
