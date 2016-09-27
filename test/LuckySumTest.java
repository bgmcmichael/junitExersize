import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fenji on 9/27/2016.
 */
public class LuckySumTest {
    LuckySum tester = new LuckySum();


    @Test
    public void luckySum() throws Exception {
        assertEquals(3, tester.luckySum(1, 1, 1));

        assertEquals(0, tester.luckySum(13, 1, 1));

        assertEquals(1, tester.luckySum(1, 13, 1));

        assertEquals(2, tester.luckySum(1, 1, 13));

        assertEquals(0, tester.luckySum(13, 13, 13));

        assertEquals(1, tester.luckySum(1, 13, 13));
    }

}