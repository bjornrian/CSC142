package labs.matrix;

import labs.matrix.Matrix;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixTest {

    private static final double DELTA_VALUE = 0.00000001;

    @Test
    public void testConstructor() {
        Matrix testMatrix = new Matrix();
        testMatrix.setValue(2, 2, 3);
        double valueFromMatrix = testMatrix.getValue(2, 2);
        assertEquals(3, valueFromMatrix, DELTA_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInput() {
        Matrix testMatrix = new Matrix();
        testMatrix.setValue(-1, -1, 4.0);
    }

    @Test
    public void swapRowsTest() {
        Matrix testMatrix = buildMatrix();
        testMatrix.swapRows(0, 2);
        assertEquals(1, testMatrix.getValue(0, 0), DELTA_VALUE);
        assertEquals(4, testMatrix.getValue(0, 1), DELTA_VALUE);
        assertEquals(0, testMatrix.getValue(0, 2), DELTA_VALUE);
        assertEquals(8, testMatrix.getValue(0, 3), DELTA_VALUE);

        assertEquals(2, testMatrix.getValue(2, 0), DELTA_VALUE);
        assertEquals(4, testMatrix.getValue(2, 1), DELTA_VALUE);
        assertEquals(1, testMatrix.getValue(2, 2), DELTA_VALUE);
        assertEquals(2, testMatrix.getValue(2, 3), DELTA_VALUE);
    }

    @Test
    public void testMultiplyRow() {
        Matrix testMatrix = buildMatrix();
        testMatrix.multiplyRow(2, 1);
        assertEquals(2, testMatrix.getValue(0, 0), DELTA_VALUE);
        assertEquals(4, testMatrix.getValue(0, 1), DELTA_VALUE);
        assertEquals(1, testMatrix.getValue(0, 2), DELTA_VALUE);
        assertEquals(2, testMatrix.getValue(0, 3), DELTA_VALUE);

        assertEquals(6, testMatrix.getValue(1, 0), DELTA_VALUE);
        assertEquals(8, testMatrix.getValue(1, 1), DELTA_VALUE);
        assertEquals(12, testMatrix.getValue(1, 2), DELTA_VALUE);
        assertEquals(8, testMatrix.getValue(1, 3), DELTA_VALUE);
    }

    @Test
    public void testAddRow() {
        Matrix testMatrix = buildMatrix();
        testMatrix.addRows(1, 0);
        assertEquals(2, testMatrix.getValue(0, 0), DELTA_VALUE);
        assertEquals(4, testMatrix.getValue(0, 1), DELTA_VALUE);
        assertEquals(1, testMatrix.getValue(0, 2), DELTA_VALUE);
        assertEquals(2, testMatrix.getValue(0, 3), DELTA_VALUE);

        assertEquals(5, testMatrix.getValue(1, 0), DELTA_VALUE);
        assertEquals(8, testMatrix.getValue(1, 1), DELTA_VALUE);
        assertEquals(7, testMatrix.getValue(1, 2), DELTA_VALUE);
        assertEquals(6, testMatrix.getValue(1, 3), DELTA_VALUE);
    }

    @Test
    public void testReplace() {
        Matrix testMatrix = buildMatrix();
        double[] replacementRow = {2, 3, 2, 5};
        testMatrix.replace(replacementRow, 1);
        assertEquals(2, testMatrix.getValue(1, 0), DELTA_VALUE);
        assertEquals(3, testMatrix.getValue(1, 1), DELTA_VALUE);
        assertEquals(2, testMatrix.getValue(1, 2), DELTA_VALUE);
        assertEquals(5, testMatrix.getValue(1, 3), DELTA_VALUE);
    }

    @Test
    public void testSum() {
        Matrix firstMatrix = buildMatrix();
        Matrix secondMatrix = buildMatrix();
        Matrix resultMatrix = firstMatrix.sum(secondMatrix);
        assertEquals(4, resultMatrix.getValue(0, 0), DELTA_VALUE);
        assertEquals(8, resultMatrix.getValue(0, 1), DELTA_VALUE);
        assertEquals(2, resultMatrix.getValue(0, 2), DELTA_VALUE);
        assertEquals(4, resultMatrix.getValue(0, 3), DELTA_VALUE);
        assertEquals(6, resultMatrix.getValue(1, 0), DELTA_VALUE);
        assertEquals(8, resultMatrix.getValue(1, 1), DELTA_VALUE);
        assertEquals(12, resultMatrix.getValue(1, 2), DELTA_VALUE);
        assertEquals(8, resultMatrix.getValue(1, 3), DELTA_VALUE);
        assertEquals(2, resultMatrix.getValue(2, 0), DELTA_VALUE);
        assertEquals(8, resultMatrix.getValue(2, 1), DELTA_VALUE);
        assertEquals(0, resultMatrix.getValue(2, 2), DELTA_VALUE);
        assertEquals(16, resultMatrix.getValue(2, 3), DELTA_VALUE);
    }

    @Test
    public void testToString() {
        Matrix matrix = buildMatrix();
        String result = matrix.toString();
        System.out.println(result);
    }

    private Matrix buildMatrix() {
        Matrix testMatrix = new Matrix();
        testMatrix.setValue(0, 0, 2);
        testMatrix.setValue(0, 1, 4);
        testMatrix.setValue(0, 2, 1);
        testMatrix.setValue(0, 3, 2);

        testMatrix.setValue(1, 0, 3);
        testMatrix.setValue(1, 1, 4);
        testMatrix.setValue(1, 2, 6);
        testMatrix.setValue(1, 3, 4);

        testMatrix.setValue(2, 0, 1);
        testMatrix.setValue(2, 1, 4);
        testMatrix.setValue(2, 2, 0);
        testMatrix.setValue(2, 3, 8);

        return testMatrix;

    }
}
