package sonyaSoap;

import static org.junit.Assert.*;
import org.junit.Test;

public class CoconutOilTest {
    @Test
    public void testBubleSize() {
        CoconutOil soap = creatSoap();
        int expectedBubbleSize = 3;
        assertEquals(expectedBubbleSize, soap.getBubbleSize());
    }

    @Test
    public void testSoftness() {
        CoconutOil soap = creatSoap();
        int expectedSoftness = 4;
        assertEquals(expectedSoftness, soap.getSoftness());
    }

    @Test
    public void testPrice() {
        CoconutOil coconutOilSoap = creatSoap();
        double expectedPrice = 1.49;
        assertEquals(expectedPrice, coconutOilSoap.getPricePerOz(), 0.1);
    }

    private CoconutOil creatSoap() {
        return new CoconutOil(Size.MEDIUM.getSize(), Shape.BAR.getShape(), Fragrance.MANGO.getFragrance(), false);
    }
}
