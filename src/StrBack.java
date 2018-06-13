import java.util.Scanner;

public class StrBack {


    public static void main(String[] args) {
        int i;
        System.out.println("文字を入力");
        Scanner scan = new Scanner(System.in);  //System.in:キーボードから入力
        String word = scan.next();
        System.out.println("入力された文字：" + word);
        String[] word_list = word.split("");    //1文字ずつ切り分ける

        StringBuilder sb = new StringBuilder();

        for (i = word.length() - 1; i >= 0; i--) {
            sb.append(word_list[i]);    //後ろの文字から1つずつ追加
        }
        String result = sb.toString();
        System.out.println("出力される文字：" + result);
    }
}
