package _04_strback_and_twice;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrBack2Test {
    @Test
    public void strBack2() {    //StrBack2のテストをするメソッド
        assertEquals(StrBack2.reverse("ab"), "ba");
        assertEquals(StrBack2.reverse(""), "");
        assertEquals(StrBack2.reverse("aba"), "aba");
        assertEquals(StrBack2.reverse("a"), "a");
    }
}
