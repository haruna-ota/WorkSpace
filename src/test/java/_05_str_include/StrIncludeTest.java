package _05_str_include;

import _04_strback_and_twice.StrBackAndTwice;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrIncludeTest {
    @Test
    public void strInclude() {
        assertTrue(StrInclude.strIncludeCheck("abc", "abc"));
        assertFalse(StrInclude.strIncludeCheck("abc", "d"));
        assertFalse(StrInclude.strIncludeCheck("abc", "ac"));
        assertFalse(StrInclude.strIncludeCheck("abc", "abcd"));
        assertTrue(StrInclude.strIncludeCheck("", ""));
        assertFalse(StrInclude.strIncludeCheck("", "a"));
        assertTrue(StrInclude.strIncludeCheck("a", "a"));
        assertTrue(StrInclude.strIncludeCheck("a", ""));
        assertTrue(StrInclude.strIncludeCheck("abc", "bc"));
        assertFalse(StrInclude.strIncludeCheck("abcd", "bcde"));


    }

}
