package _10_language;

public class Language {
    private LanguageEnum languages;

    //コンストラクタ
    Language(LanguageEnum languages) {
        this.languages = languages;
    }


    //挨拶を返すメソッド
    public String greeting(String name) {
        switch (name) {
            case "太郎":
                return "こんにちは、" + name;
            case "John":
                return "hello " + name;
            case "Marco":
                return "buon giorno " + name;
        }
        return null;
    }

    //数えるときの単位を変えすメソッド
    public String nums(String animalName) {
        switch (animalName) {
            case "犬":
                return "匹";
            case "うさぎ":
                return "羽";
        }
        return null;
    }

    //男性名詞か女性名詞かを教えてくれるメソッド
    public String noun(String noun) {
        switch (noun) {
            case "列車":
                return "男性";
            case "車":
                return "女性";
        }
        return null;
    }
}
