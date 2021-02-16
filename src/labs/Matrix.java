package labs;

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
        doubleMatrix[row][col] = value;
    }

    /** returns the value of a particular element in the matrix
     * @param row the row of the element; must be a valid row
     * @param col the column of the element; must be a valid column
     */
    public double getValue(int row, int col) {
        return doubleMatrix[row][col];
    }


    /** swap 2 rows of this matrix
     * @param r1 one of the rows to swap; must be a valid row
     * @param r2 the other row to swap; must be a valid row
     */
    public void swapRows(int r1, int r2) {
        double[] saveRow = new double[];
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
        if (multiple == 0) {
            throw new IllegalArgumentException("Multiplier cannot equal 0");
        }
        for (int i = 0; i < doubleMatrix.length; i++) {
            doubleMatrix[row][i] *= multiple;
        }
    }

    /** add row r1 into row r2. Equivalent to r2 += r1
     * @param r1 the row to add; must be a valid row
     * @param r2 the row to add into; must be a valid row.  This row will change.
     */
    public void addRows (int r2, int r1) {
        double[] addMatrix = new double[doubleMatrix[r2].length + doubleMatrix[r1].length];
        System.arraycopy(doubleMatrix[r2], 0, addMatrix, 0, doubleMatrix[r2].length);
        System.arraycopy(doubleMatrix[r1], 0, addMatrix, doubleMatrix[r2].length, doubleMatrix[r1].length);
        doubleMatrix[r2] = addMatrix;
    }

    /**
     * set new row in the matrix
     * @param row the new row to insert; must be length of Matrix.COL
     * @param rIdx the index of the new row; must be a valid row
     * @return the old row
     */
    public double[] replace(double[] row, int rIdx){

    }

    /**
     * Add 2 Matrices together and return a new Matrix
     * @param m the 2nd Matrix
     * @return the matrix sum of this + m
     */

    public Matrix sum(Matrix m){

    }


    /** Return this matrix as a String of 3 rows of numbers in 4 columns
     */
    public String toString() {

    }
}
