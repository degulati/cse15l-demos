import static org.junit.Assert.*;
import org.junit.*;

public class NumsTests {
    @Test
    public void testFormula1() {
        assertEquals(NumsExample.formula(4, 10, 2), 0.2, 0);
    }
    @Test
    public void testFormula2() {
        assertEquals(NumsExample.formula(100, 1, 2), 50, 0);
    }
    @Test
    public void testFormula3() {
        assertEquals(NumsExample.formula(1, 2, 1), 0.5, 0);
    }
}