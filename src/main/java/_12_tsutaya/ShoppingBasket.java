package _12_tsutaya;

import java.util.List;

public class ShoppingBasket {
    private List<RentalGoods> rentalGoodsList;  //カゴの中身(cd,dvd,comic...)

    //コンストラクタ
    public ShoppingBasket(List<RentalGoods> rentalGoodsList) {
        this.rentalGoodsList = rentalGoodsList;
    }

    //カゴの中身の合計金額を計算(CD,DVD旧作の場合は半額)
    public int calculateToTotalAmount() {
        int totalAmount = 0;
        for (RentalGoods rentalGoods : rentalGoodsList) {   //拡張for文（全ての要素に対して行う）
            totalAmount = totalAmount + rentalGoods.calculatePrice();
        }
        return totalAmount;
    }

    //カゴの中身のタイトルを確認
    public String showTitles() {
        String[] titles = new String[rentalGoodsList.size()];   //レンタルするもののタイトルだけを集める
        for (int i = 0; i < rentalGoodsList.size(); i++) {
            titles[i] = rentalGoodsList.get(i).getTitle();  //タイトルだけを配列に詰める
        }
        return String.join(", ", titles);   //,(スペース区切りにする)
    }
}
