import static org.junit.Assert.*;
import org.junit.*;

public class EvenSumTests {
    @Test
    public void testSumEvensLength4() {
        int[] input1 = { 12, 13, 7, 2};
        assertEquals(EvensExample.sumEvenIndices(input1), 19);
    }
    @Test
    public void testSumEvenLength5() {
        int[] input2 = { 12, 13, 7, 2, 33};
        assertEquals(EvensExample.sumEvenIndices(input2), 52);
    }
    @Test
    public void testSumEvenLength6() {
        int[] input3 = { 12, 13, 7, 8, 5, 3};
        assertEquals(EvensExample.sumEvenIndices(input3), 24);
    }
}