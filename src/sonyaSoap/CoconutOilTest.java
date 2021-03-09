package sonyaSoap;

import static org.junit.Assert.*;
import org.junit.Test;

public class CoconutOilTest {
    @Test
    public void testBubbleSize() {
        CoconutOil soap = createSoap();
        String expectedBubbleSize = "Bubble Size Rating: 3\n";
        assertEquals(expectedBubbleSize, soap.bubbleSize());
    }

    @Test
    public void testSoftness() {
        CoconutOil soap = createSoap();
        String expectedSoftness = "Softness Rating:    4\n";
        assertEquals(expectedSoftness, soap.softness());
    }

    @Test
    public void testPrice() {
        CoconutOil coconutOilSoap = createSoap();
        String expectedPrice = "Price Per Ounce:    1.49\n";
        assertEquals(expectedPrice, coconutOilSoap.pricePerOz());
    }

    private CoconutOil createSoap() {
        return new CoconutOil(Size.MEDIUM.getSize(), Shape.BAR.getShape(), Fragrance.MANGO.getFragrance(), false);
    }
}
