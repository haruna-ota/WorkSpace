package _12_tsutaya;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RentalGoodsTest {
    //テスト1パターン目（CD,DVD,漫画を1つずつ借りる時）
    @Test
    public void RentalGoods1() {
        RentalGoods cd = new Cd("タイトルA");
        RentalGoods dvd = new Dvd("タイトルB");
        RentalGoods comic = new Comic("タイトルC");

        //レンタルするものをリスト化（カゴに借りるものを入れる）
        List<RentalGoods> rentalGoodsList = new ArrayList<>(Arrays.asList(cd, dvd, comic));
        ShoppingBasket shoppingBasket = new ShoppingBasket(rentalGoodsList);

        //合計金額を計算する(assertSame)
        assertEquals(600, shoppingBasket.CalculateToTotalAmount());

        //タイトルを表示する(assertEquals)
        assertEquals("タイトルAタイトルBタイトルC", shoppingBasket.ShowTitles());
    }

    //テスト2パターン目（CDを1枚借りる時）
    @Test
    public void RentalGoods2() {
        RentalGoods cd = new Cd("タイトルA");
        RentalGoods dvd = new Dvd("タイトルB");
        RentalGoods comic = new Comic("タイトルC");

        //レンタルするものをリスト化（カゴに借りるものを入れる）
        List<RentalGoods> rentalGoodsList = new ArrayList<>(Arrays.asList(cd));
        ShoppingBasket shoppingBasket = new ShoppingBasket(rentalGoodsList);

        //合計金額を計算する(assertSame)
        assertEquals(200, shoppingBasket.CalculateToTotalAmount());

        //タイトルを表示する(assertEquals)
        assertEquals("タイトルA", shoppingBasket.ShowTitles());

    }

    //テスト3パターン目（なにも借りない時）
    @Test
    public void RentalGoods3() {
        RentalGoods cd = new Cd("タイトルA");
        RentalGoods dvd = new Dvd("タイトルB");
        RentalGoods comic = new Comic("タイトルC");

        //レンタルするものをリスト化（カゴに借りるものを入れる）
        List<RentalGoods> rentalGoodsList = new ArrayList<>(Arrays.asList());
        ShoppingBasket shoppingBasket = new ShoppingBasket(rentalGoodsList);

        //合計金額を計算する(assertSame)
        assertEquals(0, shoppingBasket.CalculateToTotalAmount());

        //タイトルを表示する(assertEquals)
        assertEquals("", shoppingBasket.ShowTitles());
    }

}
