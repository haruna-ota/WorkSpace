public class StrTwiceAndMark {
    public static void main(String[] args) {
        //テストコード
        assert stringTwiceAndMark(1234).equals("2468!");
        assert stringTwiceAndMark(0).equals("0!");
        assert stringTwiceAndMark(1).equals("2!");
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
        return stringNumber + "!";  //  末尾に！マークつける
    }

    private static String stringTwiceAndMark(int number) {
        int numTwice = numTwice(number);
        String stringNumber = numToString(numTwice);
        return markCheck(stringNumber);
    }

}
