import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fenji on 9/27/2016.
 */
public class CloseFarTest {
    CloseFar tester = new CloseFar();

    @Test
    public void closeFar() throws Exception {
        assertFalse(tester.closeFar(1, 1, 1));

        assertFalse(tester.closeFar(1, 2, 2));

        assertFalse(tester.closeFar(1, 3, 3));

        assertFalse(tester.closeFar(1, 4, 4));

        assertFalse(tester.closeFar(4, 3, 3));

        assertFalse(tester.closeFar(4, 2, 2));

        assertFalse(tester.closeFar(4, 1, 1));

        assertFalse(tester.closeFar(1, 2, 3));

        assertFalse(tester.closeFar(3, 2, 1));

        assertTrue(tester.closeFar(1, 2, 4));

        assertTrue(tester.closeFar(4, 3, 1));

        assertTrue(tester.closeFar(-1, 0, 2));

        assertTrue(tester.closeFar(-4, -3, -1));
    }
}