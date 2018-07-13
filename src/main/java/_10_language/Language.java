package _10_language;

public class Language {
    private final LanguageEnum language;

    //コンストラクタ
    public Language(LanguageEnum language) {
        this.language = language;
    }


    //挨拶を返すメソッド
    public String greeting(String name) {
        if (language == (LanguageEnum.JAPAN)) {  //日本語の場合は日本語で返す(Enumは==で比較)
            return "こんにちは、" + name;
        } else if (language == (LanguageEnum.ENGLISH)) { //英語の場合は英語で返す
            return "hello " + name;
        } else {                                   //それ以外はイタリア語で返す
            return "buon giorno " + name;
        }
    }

    //数えるときの単位を変えすメソッド
    public String nums(String animalName) {
        if (animalName.equals("犬")) {
            return "匹";
        } else {
            return "羽";
        }
    }

    //男性名詞か女性名詞かを教えてくれるメソッド
    public String noun(String noun) {
        assert language == (LanguageEnum.ITALIAN);   //イタリア語かどうかの確認
        if (noun.equals("列車")) {
            return "男性";
        } else {
            return "女性";
        }
    }
}
