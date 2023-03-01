public class Matrix {
    private int cols;
    private int rows;

    int[][] matrix = new int[cols][rows];

    public Matrix(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }
    public Matrix(int cols, int rows, int defaultValue) {
        this.cols = cols;
        this.rows = rows;
        defaultValue = 0;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void set(int x, int y, int value) {
        this.matrix[x][y] = value;
        //Matrix matrix = new Matrix(x,y, value);
    }

    public int get(int x, int y) {
        return this.matrix[x][y];
    }
}
