package _12_tsutaya;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RentalGoodsTest {

    private RentalGoods cd = new Cd("タイトルA", RentalGoodsStateEnum.NEW);
    private RentalGoods cd2 = new Cd("タイトルD", RentalGoodsStateEnum.OLD);
    private RentalGoods dvd = new Dvd("タイトルB", RentalGoodsStateEnum.NEW);
    private RentalGoods dvd2 = new Dvd("タイトルE", RentalGoodsStateEnum.OLD);
    private RentalGoods comic = new Comic("タイトルC");

    //テスト1パターン目（CD,DVD,漫画を1つずつ借りる時(CD:新作,DVD:旧作)）
    @Test
    public void RentalGoods1() {
        //レンタルするものをリスト化（カゴに借りるものを入れる）
        List<RentalGoods> rentalGoodsList = Arrays.asList(cd, dvd2, comic);
        ShoppingBasket shoppingBasket = new ShoppingBasket(rentalGoodsList);

        //合計金額を計算する(assertSame)
        assertEquals(450, shoppingBasket.calculateToTotalAmount());

        //タイトルを表示する(assertEquals)
        assertEquals("タイトルA, タイトルE, タイトルC", shoppingBasket.showTitles());
    }

    //テスト2パターン目（CD,DVD,漫画を1つずつ借りる時(CD:旧作,DVD:新作)）
    @Test
    public void RentalGoods2() {
        //レンタルするものをリスト化（カゴに借りるものを入れる）
        List<RentalGoods> rentalGoodsList = Arrays.asList(cd2, dvd, comic);
        ShoppingBasket shoppingBasket = new ShoppingBasket(rentalGoodsList);

        //合計金額を計算する(assertSame)
        assertEquals(500, shoppingBasket.calculateToTotalAmount());

        //タイトルを表示する(assertEquals)
        assertEquals("タイトルD, タイトルB, タイトルC", shoppingBasket.showTitles());
    }

    //テスト3パターン目（CDを1枚借りる時）
    @Test
    public void RentalGoods3() {
        //レンタルするものをリスト化（カゴに借りるものを入れる）
        List<RentalGoods> rentalGoodsList = Arrays.asList(cd);
        ShoppingBasket shoppingBasket = new ShoppingBasket(rentalGoodsList);

        //合計金額を計算する(assertSame)
        assertEquals(200, shoppingBasket.calculateToTotalAmount());

        //タイトルを表示する(assertEquals)
        assertEquals("タイトルA", shoppingBasket.showTitles());

    }

    //テスト4パターン目（なにも借りない時）
    @Test
    public void RentalGoods4() {
        //レンタルするものをリスト化（カゴに借りるものを入れる）
        List<RentalGoods> rentalGoodsList = Arrays.asList();
        ShoppingBasket shoppingBasket = new ShoppingBasket(rentalGoodsList);

        //合計金額を計算する(assertSame)
        assertEquals(0, shoppingBasket.calculateToTotalAmount());

        //タイトルを表示する(assertEquals)
        assertEquals("", shoppingBasket.showTitles());
    }

}
