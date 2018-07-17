package _12_tsutaya;

public class Cd implements RentalGoods {
    private int price;
    private String title;

    //コンストラクタ
    public Cd(String title) {
        this.price = 200;
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
