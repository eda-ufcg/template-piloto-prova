import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

public class MoveImpostorTest {
    
    @Test
    public void testMoveImpostor() {

        int[] in = new int[]{1, 2, 4, 3, 7, 90};
        int[] expect = new int[]{1, 2, 3, 4, 7, 90};
        assertTrue(Arrays.equals(expect, MoveImpostor.moveImpostor(in)));

        in = new int[] {5, 7, 8, 19, -4, 4, 1, 6, 8, 12, 81, 3};
        expect = new int[] {-4, 5, 7, 8, 19, 4, 1, 6, 8, 12, 81, 3};
        assertTrue(Arrays.equals(expect, MoveImpostor.moveImpostor(in)));

        in = new int[] {10, 14, 12};
        expect = new int[] {10, 12, 14};
        assertTrue(Arrays.equals(expect, MoveImpostor.moveImpostor(in)));

        in = new int[] {-1, 0, 1, 2, 5, 7, 9, 3};
        expect = new int[] {-1, 0, 1, 2, 3, 5, 7, 9};
        assertTrue(Arrays.equals(expect, MoveImpostor.moveImpostor(in)));
    }
}
