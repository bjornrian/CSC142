package NormalDistribution;

import org.junit.Test;

public class CalculationsTest {

    @Test
    public void testYValue() {
        System.out.println("Begin test");
        Calculations.findYValue(0);
        Calculations.findYValue(1);
        Calculations.findYValue(350);
        Calculations.findYValue(700);
        System.out.println("End test");
    }
}
