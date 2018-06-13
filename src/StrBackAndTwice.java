public class StrBackAndTwice {
    public static void main(String[] args) {
        //テストコード
        assert reverseAndTwice(123) == (642);
        assert reverseAndTwice(0) == (0);
        assert reverseAndTwice(1) == (2);
        assert reverseAndTwice(1230) == (642);
    }

    static int reverseAndTwice(int numbers) {
        String strNumbers = String.valueOf(numbers);   //intからStringへ変換

        String[] word_list = strNumbers.split(""); //1文字ずつ切り分ける

        StringBuilder sb = new StringBuilder();

        for (int i = strNumbers.length() - 1; i >= 0; i--) {
            sb.append(word_list[i]);    //後ろの文字から1文字ずつ追加する
        }

        String tmp = sb.toString(); //一度String型にする
        int twiceNumbers = Integer.parseInt(tmp) * 2;  //int型にして2倍する

        return twiceNumbers;

    }

}
