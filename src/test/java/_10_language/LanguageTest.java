package _10_language;

import org.junit.Test;

import static org.junit.Assert.*;

public class LanguageTest {
    @Test
    public void Language() {
        Language japanese = new Language(LanguageEnum.JAPAN);
        assertEquals("こんにちは、太郎", japanese.greeting("太郎"));
        assertEquals("匹", japanese.nums("犬"));
        assertEquals("羽", japanese.nums("うさぎ"));

        Language english = new Language(LanguageEnum.ENGLISH);
        assertEquals("hello John", english.greeting("John"));

        Language italian = new Language(LanguageEnum.ITALIAN);
        assertEquals("buon giorno Marco", italian.greeting("Marco"));
        assertEquals("男性", italian.noun("列車"));
        assertEquals("女性", italian.noun("車"));

        assertEquals("hello 太郎", english.greeting("太郎"));
        //assertEquals("男性", japanese.noun("列車"));
    }
}
