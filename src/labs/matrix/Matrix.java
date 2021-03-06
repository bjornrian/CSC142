package labs.matrix;

/** class to model a 3 x 4 matrix of doubles <br>
 * Supports Gaussian row operations
 * <br> In this version, rows and columns start at 0
 * @author csc 142 class
 */

public class Matrix {

    public static final int ROW = 3;
    public static final int COL = 4;
    double[][] doubleMatrix;

    // declare the instance variable that will hold the 2-dim array


    /**Instantiate a ROW x COL matrix, empty
     */
    public Matrix() {
        doubleMatrix = new double[ROW][COL];
    }


    /** set the value of a particular element in the matrix
     * @param row the row of the element; must be a valid row
     * @param col the column of the element; must be a valid column
     * @param value the value to be stored
     */
    public void setValue(int row, int col, double value) {
        // Why don't we have to test row/col for validity?
        validateRow(row);
        validateColumn(col);
        this.doubleMatrix[row][col] = value;
    }

    /** returns the value of a particular element in the matrix
     * @param row the row of the element; must be a valid row
     * @param col the column of the element; must be a valid column
     */
    public double getValue(int row, int col) {
        validateRow(row);
        validateColumn(col);
        return doubleMatrix[row][col];
    }


    /** swap 2 rows of this matrix
     * @param r1 one of the rows to swap; must be a valid row
     * @param r2 the other row to swap; must be a valid row
     */
    public void swapRows(int r1, int r2) {
        validateRow(r1);
        validateRow(r2);
        double[] saveRow;
        saveRow = doubleMatrix[r1];
        doubleMatrix[r1] = doubleMatrix[r2];
        doubleMatrix[r2] = saveRow;
    }

    /** multiply one row by a non-zero constant
     * @param multiple the non-zero constant
     * @param row the row to change; must be a valid row
     * @throws IllegalArgumentException if multiple is 0
     */
    public void multiplyRow(double multiple, int row) {
        validateRow(row);
        if (multiple == 0) {
            throw new IllegalArgumentException("Multiplier cannot equal 0");
        }
        for (int i = 0; i < COL; i++) {
            doubleMatrix[row][i] *= multiple;
        }
    }

    /** add row r1 into row r2. Equivalent to r2 += r1
     * @param r1 the row to add; must be a valid row
     * @param r2 the row to add into; must be a valid row.  This row will change.
     */
    public void addRows (int r2, int r1) {
        validateRow(r2);
        validateRow(r1);
        for (int i = 0; i < COL; i++) {
            doubleMatrix[r2][i] += doubleMatrix[r1][i];
        }
    }

    /**
     * set new row in the matrix
     * @param row the new row to insert; must be length of Matrix.COL
     * @param rIdx the index of the new row; must be a valid row
     * @return the old row
     */
    public double[] replace(double[] row, int rIdx){
        validateColumn(row.length - 1);
        validateRow(rIdx);
        double[] oldRow = doubleMatrix[rIdx];
        doubleMatrix[rIdx] = row;
        return oldRow;
    }

    /**
     * Add 2 Matrices together and return a new Matrix
     * @param m the 2nd Matrix
     * @return the matrix sum of this + m
     */
    public Matrix sum(Matrix m){
        Matrix resultMatrix = new Matrix();
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                resultMatrix.doubleMatrix[i][j] =
                m.doubleMatrix[i][j] + this.doubleMatrix[i][j];
            }
        }
        return resultMatrix;
    }


    /**
     * Return this matrix as a String of 3 rows of numbers in 4 columns
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                buffer.append(" | ")
                        .append(String.valueOf(doubleMatrix[i][j]));
            }
            buffer.append(" |\n");
        }

        return buffer.toString();
    }

    private void validateRow(int row) {
        if(row < 0 || row > ROW - 1) {
            throw new IllegalArgumentException("Invalid row value");
        }
    }

    private void validateColumn(int col) {
        if(col < 0 || col > COL - 1) {
            throw new IllegalArgumentException("Invalid column value");
        }
    }
}
