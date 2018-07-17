package _12_tsutaya;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RentalGoodsTest {

    RentalGoods cd = new Cd("タイトルA");
    RentalGoods dvd = new Dvd("タイトルB");
    RentalGoods comic = new Comic("タイトルC");

    //テスト1パターン目（CD,DVD,漫画を1つずつ借りる時）
    @Test
    public void RentalGoods1() {
        //レンタルするものをリスト化（カゴに借りるものを入れる）
        List<RentalGoods> rentalGoodsList = Arrays.asList(cd, dvd, comic);
        ShoppingBasket shoppingBasket = new ShoppingBasket(rentalGoodsList);

        //合計金額を計算する(assertSame)
        assertEquals(600, shoppingBasket.calculateToTotalAmount());

        //タイトルを表示する(assertEquals)
        assertEquals("タイトルA, タイトルB, タイトルC", shoppingBasket.showTitles());
    }

    //テスト2パターン目（CDを1枚借りる時）
    @Test
    public void RentalGoods2() {
        //レンタルするものをリスト化（カゴに借りるものを入れる）
        List<RentalGoods> rentalGoodsList = Arrays.asList(cd);
        ShoppingBasket shoppingBasket = new ShoppingBasket(rentalGoodsList);

        //合計金額を計算する(assertSame)
        assertEquals(200, shoppingBasket.calculateToTotalAmount());

        //タイトルを表示する(assertEquals)
        assertEquals("タイトルA", shoppingBasket.showTitles());

    }

    //テスト3パターン目（なにも借りない時）
    @Test
    public void RentalGoods3() {
        //レンタルするものをリスト化（カゴに借りるものを入れる）
        List<RentalGoods> rentalGoodsList = Arrays.asList();
        ShoppingBasket shoppingBasket = new ShoppingBasket(rentalGoodsList);

        //合計金額を計算する(assertSame)
        assertEquals(0, shoppingBasket.calculateToTotalAmount());

        //タイトルを表示する(assertEquals)
        assertEquals("", shoppingBasket.showTitles());
    }

}
