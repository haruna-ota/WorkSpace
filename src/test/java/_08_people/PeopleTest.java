package _08_people;

import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {
    @Test
    public void people() {
        //人を生成
        People people1 = new People("Kit", PeopleAddressEnum.Office);
        People people2 = new People("Mary", PeopleAddressEnum.Home);

        assertEquals(people1.name, "Kit");
        assertEquals(people1.address, PeopleAddressEnum.Office);
        assertEquals(people2.name, "Mary");
        assertEquals(people2.address, PeopleAddressEnum.Home);

        assertSame(People.NUMBER_OF_PEOPLE, 2);

        //新しく人を生成
        People people3 = new People("Will", PeopleAddressEnum.Office);

        assertEquals(people3.name, "Will");
        assertEquals(people3.address, PeopleAddressEnum.Office);

        assertSame(People.NUMBER_OF_PEOPLE, 3);

    }

}
