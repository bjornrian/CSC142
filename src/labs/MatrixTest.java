package labs;

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
