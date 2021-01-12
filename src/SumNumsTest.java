import static org.junit.Assert.*;
import org.junit.Test;

public class SumNumsTest {
    @Test
    public void testOneParam() {
        assertEquals(6, SumNums.sumNums(3));
    }
}