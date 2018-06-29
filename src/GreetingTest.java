public class GreetingTest {
    public static void main(String[] args) {
        //テストコード
        assert Greeting.greeting(Greeting.TimeZone.Asa).equals("おはよう");     //enumを直接指定する
        assert Greeting.greeting(Greeting.TimeZone.Hiru).equals("こんにちは");  //enumを直接指定する
        assert Greeting.greeting(Greeting.TimeZone.Yoru).equals("こんばんは");  //enumを直接指定する
    }
}
