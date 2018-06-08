import java.util.ArrayList;

public class Zundokokiyoshi2 {
    public static void main(String[] args) {
        String[] zundoko = {"ズン ", "ドコ "};
        int i;
        int z_count = 0;    //ズンを数える用
        int rand;
        int flag = 0;       //終了判定用フラグ
        int check_start;    //チェック開始用
        ArrayList<String> hyouji = new ArrayList<>();  //ズンとドコをためておく箱

        //配列に入れる
        while (flag == 0) {
            rand = (int) (Math.random() * 10);             //1~10までをランダムに生成
            if (rand <= 4) {
                hyouji.add(zundoko[0]);
            } else {
                hyouji.add(zundoko[1]);
            }

            //終了条件判定
            if (hyouji.size() >= 5 && hyouji.get(hyouji.size() - 1).equals(zundoko[1])) {
                check_start = hyouji.size() - 2;    //index番号はhyoji.size()から1引いた数が最後の番号
                for (i = check_start; i >= 0; i--) {
                    if (hyouji.get(i).equals(zundoko[1])) {     //途中でドコがきたらリセット(z=0)
                        z_count = 0;
                        break;
                    } else {
                        z_count++;
                        if (z_count >= 4) {     //ズンが4回以上連続で続いたら終了(flag=1)
                            flag = 1;
                            break;
                        }
                    }
                }
            }
        }

        //順番に配列の中身を表示
        for (i = 0; i < hyouji.size(); i++) {
            System.out.print(hyouji.get(i));
        }
        System.out.print("キ・ヨ・シ！");
    }
}