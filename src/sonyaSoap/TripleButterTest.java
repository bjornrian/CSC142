package sonyaSoap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleButterTest {
    @Test public void testBubbleSize() {
        TripleButter soap = createSoap();
        int expectedBubbleSize = 4;
        assertEquals(expectedBubbleSize, soap.getBubbleSize());
    }

    @Test public void testSoftness() {
        TripleButter soap = createSoap();
        int expectedSoftness = 5;
        assertEquals(expectedSoftness, soap.getSoftness());
    }

    @Test public void testPrice() {
        TripleButter soap = createSoap();
        double expectedPrice = 1.60;
        assertEquals(expectedPrice, soap.getPricePerOz(), 0.1);
    }

    @Test public void testExfoliating() {
        TripleButter soap = createSoap();
        boolean expectedExfoliating = false;
        assertEquals(expectedExfoliating, soap.getExfoliating());
    }

    private TripleButter createSoap() {
        return new TripleButter(Size.MEDIUM.getSize(), Shape.BAR.getShape(), Fragrance.PLUMERIA.getFragrance());
    }
}
