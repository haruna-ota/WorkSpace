public class StrInclude {
    public static void main(String[] args) {
        //テストコード
        assert strIncludeCheck("abc", "abc");
        assert !strIncludeCheck("abc", "d");
        assert !strIncludeCheck("abc", "ac");
        assert !strIncludeCheck("abc", "abcd");
        assert strIncludeCheck("", "");
        assert !strIncludeCheck("", "a");
        assert strIncludeCheck("a", "a");
        assert strIncludeCheck("a", "");
        assert strIncludeCheck("abc", "bc");
        assert !strIncludeCheck("abcd", "bcde");
    }

    private static boolean strIncludeCheck(String word, String word2) {
        int i, j = 0;
        int correctCount = 0;   //合致文字判定用

        //空文字判定
        if (word2.isEmpty()) {  //第二引数が空文字だったら絶対true
            return true;
        } else if (word.isEmpty()) { //第二引数が空文字じゃない状態で第一引数が空文字の場合false
            return false;
        } else {    //それ以外は一文字ずつ判定開始
            String[] wordList = word.split("");    //第一引数を1文字ずつ切り分ける
            String[] word2List = word2.split("");    //第二引数を1文字ずつ切り分ける

            if (wordList.length < word2List.length) {   //第一引数より第二引数が長い場合はfalse
                return false;
            } else {
                //照合開始位置確認
                for (i = 0; i <= wordList.length - 1; i++) {
                    if (wordList[i].equals(word2List[j])) {
                        correctCount++;
                        j++;
                    } else {    //連続して合致しなかった場合はカウントを戻す
                        correctCount = 0;
                        j = 0;
                    }
                }
            }
            return word2List.length == correctCount;    //照合した文字全てが合致したらtrue
        }
    }
}