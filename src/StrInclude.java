public class StrInclude {
    public static void main(String[] args) {
        //テストコード
        assert strIncludeCheck("abc", "ab") == (true);
        assert strIncludeCheck("abc", "d") == (false);
        assert strIncludeCheck("abc", "ac") == (false);
        assert strIncludeCheck("abc", "abcd") == (false);
        assert strIncludeCheck("", "") == (true);
        assert strIncludeCheck("", "a") == (false);
        assert strIncludeCheck("a", "a") == (true);
        assert strIncludeCheck("a", "") == (true);
    }

    static boolean strIncludeCheck(String word, String word2) {
        if (word.contains(word2)) { //第一引数に第二引数がまるっと含まれているか
            return true;
        } else {
            return false;
        }
    }
}
