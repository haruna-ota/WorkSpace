package _12_tsutaya;

public class Comic implements RentalGoods {
    private int price;
    private String title;

    //コンストラクタ
    public Comic(String title) {
        this.price = 100;
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int calculatePrice() {   //新旧割引を計算するメソッド
        return price;       //新旧が無いため、定価
    }
}
