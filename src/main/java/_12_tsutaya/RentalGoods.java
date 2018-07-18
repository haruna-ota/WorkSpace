package _12_tsutaya;

public interface RentalGoods {
    //ルールを書く
    public String getTitle();       //タイトルを取ってくる

    public int calculatePrice();    //新旧割引を計算する
}
