package _11_langiage2;

public class Japanese implements Language { //インタフェース(Language)をつかう

    //挨拶を返すメソッド
    public String greeting(String name) {
        return "こんにちは、" + name;
    }

    //数えるときの単位を返すメソッド
    public String nums(String animalName) {
        if (animalName.equals("犬")) {
            return "匹";
        } else {
            return "羽";
        }
    }
}
