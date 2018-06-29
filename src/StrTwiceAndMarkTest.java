public class StrTwiceAndMarkTest {
    public static void main(String[] args) {
        //テストコード
        assert StrTwiceAndMark.stringTwiceAndMark(1234).equals("2468!");
        assert StrTwiceAndMark.stringTwiceAndMark(0).equals("0!");
        assert StrTwiceAndMark.stringTwiceAndMark(1).equals("2!");
    }
}
