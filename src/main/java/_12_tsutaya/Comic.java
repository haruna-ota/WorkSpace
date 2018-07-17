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
    public int getPrice() {
        return price;
    }
}
