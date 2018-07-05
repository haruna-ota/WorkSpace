package _06_str_twice_and_mark;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrTwiceAndMarkTest {
    @Test
    public void strTwiceAndMark() {
        assertEquals(StrTwiceAndMark.stringTwiceAndMark(1234), "2468!");
        assertEquals(StrTwiceAndMark.stringTwiceAndMark(0), "0!");
        assertEquals(StrTwiceAndMark.stringTwiceAndMark(1), "2!");

    }
}