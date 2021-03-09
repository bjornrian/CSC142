package sonyaSoap;

import org.junit.Test;

public class GlycerinTest {
    @Test
    public void testConstructorWithValidArguments() {
        Glycerin glycerin = new Glycerin(Size.MEDIUM.getSize(), Shape.BAR.getShape(), Fragrance.COCONUT.getFragrance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidSize() {
        Glycerin glycerin = new Glycerin(Size.SMALL.getSize(), Shape.BAR.getShape(), Fragrance.COCONUT.getFragrance());
    }
}
