package _04_strback_and_twice;

public class StrBack2 {
    public static void main(String[] args) {
        assert reverse("ab").equals("ba");
        assert reverse("").equals("");
        assert reverse("aba").equals("aba");
        assert reverse("a").equals("a");
    }

    static String reverse(String word){
        int i;
        String[] word_list = word.split("");    //1文字ずつ切り分ける

        StringBuilder sb = new StringBuilder();

        for (i = word.length() - 1; i >= 0; i--) {
            sb.append(word_list[i]);    //後ろの文字から1つずつ追加
        }
        String result = sb.toString();

        return result;
    }
}
