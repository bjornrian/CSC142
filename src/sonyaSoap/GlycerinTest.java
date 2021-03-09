package sonyaSoap;

import org.junit.Test;

public class GlycerinTest {
    @Test
    public void testConstructor() {
        Glycerin glycerin = new Glycerin(Size.MEDIUM.getSize(), Shape.BAR, Fragrance.COCONUT);
    }
}
