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

    @Test
    public void testExfoliating() {
        Chunked soap = createSoap();
        boolean expectedExfoliating = false;
        assertEquals(expectedExfoliating, soap.getExfoliating());
    }

    @Test
    public void testBubbleSize() {
        Chunked soap = createSoap();
        int expectedBubbleSize = 2;
        assertEquals(expectedBubbleSize, soap.getBubbleSize());
    }

    @Test
    public void testSoftness() {
        Chunked soap = createSoap();
        int expectedSoftness = 3;
        assertEquals(expectedSoftness, soap.getSoftness());
    }

    @Test
    public void testPrice() {
        Chunked soap = createSoap();
        double expectedPrice = 1.39;
        assertEquals(expectedPrice, soap.getPricePerOz(), 0.0001);
    }

    private Chunked createSoap() {
        return new Chunked(Size.LARGE.getSize(), Shape.SEASHELL.getShape(), Fragrance.MANGO.getFragrance());
    }
}
