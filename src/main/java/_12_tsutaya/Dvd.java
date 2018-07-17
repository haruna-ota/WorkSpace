package _12_tsutaya;

public class Dvd implements RentalGoods {
    private int price;
    private String title;

    //コンストラクタ
    public Dvd(String title) {
        this.price = 300;
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
