package sonyaSoap;

import org.junit.Test;

public class OliveOilTest {
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidShape() {
        OliveOil soap = createSoap();
    }

    private OliveOil createSoap() {
        return new OliveOil(Size.LARGE.getSize(), Shape.BAR.getShape(), Fragrance.PINEAPPLE.getFragrance(), false);
    }
}
