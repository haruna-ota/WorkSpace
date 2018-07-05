package _04_strback_and_twice;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrBackAndTwiceTest {
    @Test
    public void strBackAndTwice() {
        assertEquals(StrBackAndTwice.reverseAndTwice(123), 642);
        assertEquals(StrBackAndTwice.reverseAndTwice(0), 0);
        assertEquals(StrBackAndTwice.reverseAndTwice(1), 2);
        assertEquals(StrBackAndTwice.reverseAndTwice(1230), 642);
    }

}
