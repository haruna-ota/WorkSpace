public class Greeting {
    public static void main(String[] args) {

    }

    static String greeting(TimeZone timeZone) {   //パッケージプライベート
        String greet = null;    //初期化
        switch (timeZone) {
            case Asa:
                greet = "おはよう";
                break;
            case Hiru:
                greet = "こんにちは";
                break;
            case Yoru:
                greet = "こんばんは";
                break;
        }
        return greet;
    }

    protected enum TimeZone {
        Asa("朝"),
        Hiru("昼"),
        Yoru("夜");

        private String timeZone;

        TimeZone(String timeZone) { //コンストラクタ
            this.timeZone = timeZone;
        }
    }
}

