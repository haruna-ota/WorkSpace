package _12_tsutaya;

import java.util.List;

public class ShoppingBasket {
    private List<RentalGoods> rentalGoodsList;  //カゴの中身(cd,dvd,comic...)

    //コンストラクタ
    public ShoppingBasket(List<RentalGoods> rentalGoodsList) {
        this.rentalGoodsList = rentalGoodsList;
    }

    //カゴの中身の合計金額を計算
    public int CalculateToTotalAmount() {
        int totalAmount = 0;
        for (RentalGoods rentalGoods : rentalGoodsList) {   //拡張for文（全ての要素に対して行う）
            totalAmount = totalAmount + rentalGoods.getPrice();    //i個目のpriceを取ってくる
        }
        return totalAmount;
    }

    //カゴの中身のタイトルを確認
    public String ShowTitles() {
        String titles = "";
        for (RentalGoods rentalGoods : rentalGoodsList) {
            titles = titles + rentalGoods.getTitle();
        }
        return titles;
    }
}
