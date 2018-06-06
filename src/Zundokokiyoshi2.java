public class Zundokokiyoshi2 {
    public static void main(String[] args) {
        String[] zundoko = {"ズン ", "ドコ "};
        int i = 0;
        int z_count = 0;  //ズンのカウント用変数
        int rand;
        int flag = 0; //ループ修了判定用フラグ
        String[] hyouji = new String[100];

        while (flag == 0) {
            rand = (int) (Math.random() * 10);     //1~10までをランダムに生成
            if (rand <= 4) {
                hyouji[i] = zundoko[0];
                z_count++;
            } else {
                hyouji[i] = zundoko[1];
                if (z_count >= 4) {
                    flag = 1;
                } else {
                    z_count = 0;    //カウントを戻す
                }
            }
            System.out.print(hyouji[i]);
            i++;
        }
        System.out.println("キ・ヨ・シ！");
    }
}