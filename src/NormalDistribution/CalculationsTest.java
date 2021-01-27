package NormalDistribution;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculationsTest {

    @Test
    public void testYValue() {
        assertEquals("0.000009", Calculations.findYValue(0));
        assertEquals("0.000044", Calculations.findYValue(50));
        assertEquals("0.00005", Calculations.findYValue(54));
        assertEquals("0.000175", Calculations.findYValue(100));
        assertEquals("0.001295", Calculations.findYValue(200));
        assertEquals("0.003521", Calculations.findYValue(300));
        assertEquals("0.003989", Calculations.findYValue(350));
        assertEquals("0.003521", Calculations.findYValue(400));
        assertEquals("0.001295", Calculations.findYValue(500));
        assertEquals("0.000175", Calculations.findYValue(600));
        assertEquals("0.000009", Calculations.findYValue(700));
    }
}
