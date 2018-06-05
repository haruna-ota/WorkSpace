public class Zundokokiyoshi {
    public static void main(String[] args) {
        String[] zundoko = {"ズン ", "ドコ "};
        int rand;
        int flag = 0; //判定用フラグ
        String end = "ズン ズン ズン ズン ドコ "; //正解の文字列
        String out = "ズン ズン ズン ズン ズン "; //ズンが５回続いたらカウントリセット
        StringBuilder sb = new StringBuilder();

        while (flag == 0) {
            rand = (int) (Math.random() * 10);     //1~10までをランダムに生成
            if (rand <= 4) {
                sb.append(zundoko[0]);  //文字列を追加
                if (sb.toString().endsWith(out)) {
                    sb.setLength(0);
                }
            } else {
                sb.append(zundoko[1]);  //文字列を追加
                if (sb.toString().endsWith(end)) {
                    flag = 1;   //ループ終わり
                }
            }
        }
        System.out.println(sb + "キ・ヨ・シ！");
    }
}
