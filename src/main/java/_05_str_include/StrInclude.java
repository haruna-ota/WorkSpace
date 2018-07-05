package _05_str_include;

public class StrInclude {
    public static boolean strIncludeCheck(String word, String word2) {
        //空文字判定
        if (word2.isEmpty()) {  //第二引数が空文字だったら絶対true
            return true;
        } else if (word.isEmpty()) { //第二引数が空文字じゃない状態で第一引数が空文字の場合false
            return false;
        } else if (word.length() < word2.length()) {   //第一引数より第二引数が長い場合はfalse
            return false;
        } else {    //それ以外は一文字ずつ判定開始
            int correctCount = 0;   //合致文字判定用
            String[] wordArray = word.split("");    //第一引数を1文字ずつ切り分ける
            String[] word2Array = word2.split("");    //第二引数を1文字ずつ切り分ける

            //照合開始位置確認
            int i, j = 0;

            for (i = 0; i <= wordArray.length - 1; i++) {
                if (wordArray[i].equals(word2Array[j])) {
                    correctCount++;
                    j++;
                } else {    //連続して合致しなかった場合はカウントを戻す
                    correctCount = 0;
                    j = 0;
                }
            }
            return word2Array.length == correctCount;    //照合した文字全てが合致したらtrue
        }
    }
}
