package quizzes;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    private static final double DELTA = 0.0001;

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSizeOfArrayList() {
        //[12, 5, 4, -5]
        ArrayList<Point> plot = new ArrayList<Point>();
        Point p = new Point( 12, 16 );
        plot.add( p );//1
        plot.add( new Point( 0, 0 ) );//2
        plot.add( new Point( 4, 8 ) );//3
        plot.add( 2, new Point( 5, 10 ) );//4
        p = plot.get( 0 );//4
        p = plot.remove( 1 );//3
        plot.add( new Point( -5, 5 ) );//4

        int expectedSize = 4;
        assertEquals(expectedSize, plot.size());

        Point actualPoint = plot.get(1);
        assertEquals(5, actualPoint.getX(), DELTA);
        assertEquals(10, actualPoint.getY(), DELTA);

        Point point = plot.get(2);
        assertEquals(4, point.getX(), DELTA);
        assertEquals(8, point.getY(), DELTA);

        plot.get(5);

    }
}
