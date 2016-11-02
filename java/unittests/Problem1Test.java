import org.junit.Test;
import static org.junit.Assert.*;

public class Problem1Test {

    @Test
    public void testWalkenSimulator() {
        Problem1 problem1 = new Problem1();

        String result = problem1.walkenSimulator("one");

        assertEquals("one", result);

    }
}