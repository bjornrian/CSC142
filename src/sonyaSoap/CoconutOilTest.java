package sonyaSoap;

import static org.junit.Assert.*;
import org.junit.Test;

public class CoconutOilTest {
    @Test
    public void testBubbleSize() {
        CoconutOil soap = createSoap();
        int expectedBubbleSize = 3;
        assertEquals(expectedBubbleSize, soap.getBubbleSize());
    }

    @Test
    public void testSoftness() {
        CoconutOil soap = createSoap();
        int expectedSoftness = 4;
        assertEquals(expectedSoftness, soap.getSoftness());
    }

    @Test
    public void testPrice() {
        CoconutOil coconutOilSoap = createSoap();
        double expectedPrice = 1.49;
        assertEquals(expectedPrice, coconutOilSoap.getPricePerOz(), 0.0001);
    }

    private CoconutOil createSoap() {
        return new CoconutOil(Size.MEDIUM.getSize(), Shape.BAR.getShape(), Fragrance.MANGO.getFragrance(), false);
    }
}
