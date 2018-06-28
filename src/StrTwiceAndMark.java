public class StrTwiceAndMark {
    public static void main(String[] args) {
        //テストコード
        //数字を2倍する
        assert numTwice(1234) == (2468);
        assert numTwice(0) == (0);
        assert numTwice(1) == (2);
        //数字を文字に変換
        assert numToString(2468).equals("2468");
        assert numToString(0).equals("0");
        assert numToString(2).equals("2");
        //末尾に！をつける
        assert markCheck("2468").equals("2468!");
        assert markCheck("0").equals("0!");
        assert markCheck("2").equals("2!");
    }

    //数を2倍にするメソッド
    private static int numTwice(int number) {
        return number * 2;     //数値を2倍する
    }

    //数を文字列にするメソッド
    private static String numToString(int twiceNumber) {
        return Integer.toString(twiceNumber);   //int型からString型に変換
    }

    //末尾に！をつけるメソッド
    private static String markCheck(String stringNumber) {
        StringBuilder sb = new StringBuilder(stringNumber);
        return String.valueOf(sb.append("!"));  //  末尾に！マークつける
    }
}
