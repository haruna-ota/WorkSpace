public class StrBackandTwice {
    public static void main(String[] args) {
        //テストコード
        assert reverseandtwice(123) == (642);
        assert reverseandtwice(0) == (0);
        assert reverseandtwice(1) == (2);
        assert reverseandtwice(1230) == (642);
    }

    static int reverseandtwice(int numbers) {
        int i;
        String str_numbers = String.valueOf(numbers);   //intからStringへ変換

        String[] word_list = str_numbers.split(""); //1文字ずつ切り分ける

        StringBuilder sb = new StringBuilder();

        for (i = str_numbers.length() - 1; i >= 0; i--) {
            sb.append(word_list[i]);    //後ろの文字から1文字ずつ追加する
        }

        String tmp = sb.toString(); //一度String型にする
        int twice_numbers = Integer.parseInt(tmp) * 2;  //int型にして2倍する

        return twice_numbers;

    }

}
