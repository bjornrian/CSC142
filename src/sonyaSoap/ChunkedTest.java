package sonyaSoap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChunkedTest {
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSize() {
        Chunked soap = new Chunked(Size.SMALL.getSize(), Shape.BAR.getShape(), Fragrance.MANGO.getFragrance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidShape() {
        Chunked soap = new Chunked(Size.LARGE.getSize(), Shape.SEAHORSE.getShape(), Fragrance.PINEAPPLE.getFragrance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidFragrance() {
        Chunked soap = new Chunked(Size.LARGE.getSize(), Shape.SEASHELL.getShape(), Fragrance.OCEAN_BREEZE.getFragrance());
    }

    @Test public void testExfoliating() {
        Chunked soap = createSoap();
        String expectedExfoliating = "Exfoliating:        false\n";
        assertEquals(expectedExfoliating, soap.exfoliating());
    }

    private Chunked createSoap() {
        return new Chunked(Size.LARGE.getSize(), Shape.SEASHELL.getShape(), Fragrance.MANGO.getFragrance());
    }
}
