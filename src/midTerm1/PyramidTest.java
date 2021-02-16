package midTerm1;

import org.junit.Test;

public class PyramidTest {
    @Test
    public void testDefaultConstructor() {
        Pyramid myPyramid = new Pyramid("myPyramid1");
        double volume = myPyramid.getVolume();
        System.out.println("volume = " + volume);
    }

    @Test
    public void testConstructor() {
        Pyramid myPyramid = new Pyramid("myPyramid2", 2.0, 3.0);
        double volume = myPyramid.getVolume();
        System.out.println("volume = " + volume);
    }


}
