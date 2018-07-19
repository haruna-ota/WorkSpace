package _12_tsutaya;

public class Dvd implements RentalGoods {
    private int price;
    private String title;
    private RentalGoodsStateEnum state;

    //コンストラクタ
    public Dvd(String title, RentalGoodsStateEnum state) {
        this.price = 300;
        this.title = title;
        this.state = state;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int calculatePrice() {   //新旧割引を計算するメソッド
        return state == RentalGoodsStateEnum.OLD ? price / 2 : price;   //三項演算子
    }
}
