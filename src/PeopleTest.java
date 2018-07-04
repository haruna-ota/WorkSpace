public class PeopleTest {
    public static void main(String[] args) {
        //テストコード
        //人を生成
        People people1 = new People("Kit", PeopleAddressEnum.Office);
        People people2 = new People("Mary", PeopleAddressEnum.Home);

        assert people1.name.equals("Kit");  //人1の名前が一致しているか
        assert people1.address == PeopleAddressEnum.Office; //人1の居場所が一致しているか

        assert people2.name.equals("Mary"); //人2の名前が一致しているか
        assert people2.address == PeopleAddressEnum.Home; //人2の居場所が一致しているか

        //人数確認
        assert People.NUMBER_OF_PEOPLE == 2;    //2人ならok


        //新しく人を生成
        People people3 = new People("Will", PeopleAddressEnum.Office);

        assert people3.name.equals("Will"); //人3の名前が一致しているか
        assert people3.address == PeopleAddressEnum.Office; //人3の居場所が一致しているか

        //人数確認
        assert People.NUMBER_OF_PEOPLE == 3;    //3人ならok

    }
}
