package _10_language;

import org.junit.Test;

import static org.junit.Assert.*;

public class LanguageTest {
    @Test
    public void Language() {
        Language language1 = new Language(LanguageEnum.JAPAN);
        assertEquals("こんにちは、太郎", language1.greeting("太郎"));
        assertEquals("匹", language1.nums("犬"));
        assertEquals("羽", language1.nums("うさぎ"));

        Language language2 = new Language(LanguageEnum.ENGLISH);
        assertEquals("hello John", language2.greeting("John"));

        Language language3 = new Language(LanguageEnum.ITALIAN);
        assertEquals("buon giorno Marco", language3.greeting("Marco"));
        assertEquals("男性", language3.noun("列車"));
        assertEquals("女性", language3.noun("車"));

    }
}
