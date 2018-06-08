import java.util.Scanner;

public class Str_back {
    public static void main(String[] args) {
        int i;
        System.out.println("文字を入力");
        Scanner scan = new Scanner(System.in);  //System.in:キーボードから入力
        String word = scan.next();
        System.out.println("入力された文字：" + word);
        String[] word_list = word.split("");    //1文字ずつ切り分ける
        System.out.print("出力される文字：");
        for (i = word.length() - 1; i >= 0; i--) {
            System.out.print(word_list[i]);
        }
    }
}
