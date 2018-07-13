package _11_langiage2;

public class Italian implements Language {   //インタフェース(Language)をつかう

    //挨拶を返すメソッド
    @Override   //interfaceのメソッドを実装するときは@Overrideをつける
    public String greeting(String name) {
        return "buon giorno " + name;
    }

    //男性名詞か女性名詞かを教えてくれるメソッド
    public String noun(String noun) {
        if (noun.equals("列車")) {
            return "男性";
        } else {
            return "女性";
        }
    }
}
