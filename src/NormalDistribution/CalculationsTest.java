package NormalDistribution;

import org.junit.Test;

public class CalculationsTest {

    @Test
    public void testYValue() {
        System.out.println("Begin test");
        Calculations.findYValue(0);
        Calculations.findYValue(50);
        Calculations.findYValue(54);
        Calculations.findYValue(100);
        Calculations.findYValue(200);
        Calculations.findYValue(300);
        Calculations.findYValue(350);
        Calculations.findYValue(400);
        Calculations.findYValue(500);
        Calculations.findYValue(600);
        Calculations.findYValue(700);
        System.out.println("End test");
    }
}
