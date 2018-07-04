class People {  //パッケージプライベート
    String name;    //名前
    PeopleAddressEnum address; //居場所（家or会社）
    static int NUMBER_OF_PEOPLE = 0;    //人数

    //コンストラクタ
    People(String name, PeopleAddressEnum address) {
        this.name = name;
        this.address = address;
        updateNumberOfPeople(); //Peopleがnewされるたびに呼び出される
    }

    //人数を増やす
    private void updateNumberOfPeople() {
        People.NUMBER_OF_PEOPLE++;  //このメソッドが呼ばれるたびに人数を増やす
    }
}
