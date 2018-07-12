package _11_langiage2;

public class English implements Language {  //インタフェース(Language)をつかう
    //挨拶を返すメソッド
    public String greeting(String name) {
        return "hello " + name;
    }
}
