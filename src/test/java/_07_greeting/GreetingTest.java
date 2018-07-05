package _07_greeting;

import org.junit.Test;

import java.util.TimeZone;

import static org.junit.Assert.*;

public class GreetingTest {
    @Test
    public void greeting() {
        assertEquals(Greeting.greeting(GreetingEnum.Asa), "おはよう");
        assertEquals(Greeting.greeting(GreetingEnum.Hiru), "こんにちは");
        assertEquals(Greeting.greeting(GreetingEnum.Yoru), "こんばんは");

    }

}
