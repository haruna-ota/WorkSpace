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

        StrBack2 strBack2 = new StrBack2();    //StrBack2クラスのメソッドを使う

        String tmp = strBack2.reverse(strNumbers);  //結果を一度String型に入れる

        int twiceNumbers = Integer.parseInt(tmp) * 2;  //int型にして2倍する

        return twiceNumbers;

    }

}
