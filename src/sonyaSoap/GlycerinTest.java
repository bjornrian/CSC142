package sonyaSoap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GlycerinTest {
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidSize() {
        Glycerin glycerin = new Glycerin(Size.SMALL.getSize(), Shape.BAR.getShape(), Fragrance.COCONUT.getFragrance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidFragrance() {
        Glycerin soap = new Glycerin(Size.LARGE.getSize(), Shape.SEASHELL.getShape(), Fragrance.OCEAN_BREEZE.getFragrance());
    }

    @Test public void testExfoliating() {
        Glycerin soap = createSoap();
        boolean expectedExfoliating = false;
        assertEquals(expectedExfoliating, soap.getExfoliating());
    }

    private Glycerin createSoap() {
        return new Glycerin(Size.LARGE.getSize(), Shape.SEASHELL.getShape(), Fragrance.PLUMERIA.getFragrance());
    }

}
