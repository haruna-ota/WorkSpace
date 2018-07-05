package _07_greeting;

public class GreetingTest {
    public static void main(String[] args) {
        //テストコード
        assert Greeting.greeting(GreetingEnum.Asa).equals("おはよう");     //enumを直接指定する
        assert Greeting.greeting(GreetingEnum.Hiru).equals("こんにちは");  //enumを直接指定する
        assert Greeting.greeting(GreetingEnum.Yoru).equals("こんばんは");  //enumを直接指定する
    }
}
