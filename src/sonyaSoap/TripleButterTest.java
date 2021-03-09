package sonyaSoap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleButterTest {
    @Test public void testBubbleSize() {
        TripleButter soap = createSoap();
        String expectedBubbleSize = "Bubble Size Rating: 3\n";
        assertEquals(expectedBubbleSize, soap.bubbleSize());
    }

    @Test public void testSoftness() {
        TripleButter soap = createSoap();
        String expectedSoftness = "Softness Rating:    4\n";
        assertEquals(expectedSoftness, soap.softness());
    }

    @Test public void testPrice() {
        TripleButter soap = createSoap();
        String expectedPrice = "Price Per Ounce:    1.49\n";
        assertEquals(expectedPrice, soap.pricePerOz());
    }

    @Test public void testExfoliating() {
        TripleButter soap = createSoap();
        String expectedExfoliating = "Exfoliating:        false\n";
        assertEquals(expectedExfoliating, soap.exfoliating());
    }

    private TripleButter createSoap() {
        return new TripleButter(Size.MEDIUM.getSize(), Shape.BAR.getShape(), Fragrance.PLUMERIA.getFragrance());
    }
}
