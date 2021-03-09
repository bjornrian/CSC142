package sonyaSoap;

import org.junit.Test;

public class ChunkedTest {
    @Test
    public void testInvalidShape() {
        Chunked chunkedSoap = new Chunked(Size.SMALL.getSize(), Shape.SEAHORSE.getShape(), Fragrance.MANGO.getFragrance());
    }
}
