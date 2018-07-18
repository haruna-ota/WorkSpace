package _12_tsutaya;

public class Cd implements RentalGoods {
    private int price;      //値段
    private String title;   //タイトル
    private RentalGoodsStateEnum state; //新作or旧作

    //コンストラクタ
    public Cd(String title, RentalGoodsStateEnum state) {
        this.price = 200;
        this.title = title;
        this.state = state;

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int calculatePrice() {   //新旧割引を計算するメソッド
        if (state == RentalGoodsStateEnum.OLD) {
            return price / 2;    //旧作の場合、半額になる
        } else {
            return price;       //新作の場合、定価
        }
    }
}
