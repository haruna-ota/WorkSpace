package _11_langiage2;

import org.junit.Test;

import static org.junit.Assert.*;

public class LanguageTest {
    @Test
    public void Language() {
        Japanese japanese = new Japanese();
        assertEquals("こんにちは、太郎", japanese.greeting("太郎"));
        assertEquals("匹", japanese.nums("犬"));
        assertEquals("羽", japanese.nums("うさぎ"));

        English english = new English();
        assertEquals("hello John", english.greeting("John"));

        Italian italian = new Italian();
        assertEquals("buon giorno Marco", italian.greeting("Marco"));
        assertEquals("男性", italian.noun("列車"));
        assertEquals("女性", italian.noun("車"));
    }
}
