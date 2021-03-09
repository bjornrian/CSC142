package sonyaSoap;

import static org.junit.Assert.*;
import org.junit.Test;

public class CoconutOilTest {
    @Test
    public void testPrice() {
        CoconutOil coconutOilSoap = new CoconutOil(Size.MEDIUM.getSize(), Shape.BAR.getShape(), Fragrance.MANGO.getFragrance(), false);
        double expectedPrice = 1.49;
        assertEquals(expectedPrice, coconutOilSoap.getPricePerOz());
    }
}
