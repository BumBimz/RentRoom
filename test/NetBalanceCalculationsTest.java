import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetBalanceCalculationsTest {
    StandardRoom room = new StandardRoom();
    NetBalanceCalculations netBalanceCalculations = new NetBalanceCalculations();
    @Test
    public void
    standard_room_one_weekday_should_be_pay_2000(){
        assertEquals(2000, netBalanceCalculations.onWeekdayBalance(room, 1));
    }

    @Test
    public void
    standard_room_two_weekday_should_be_pay_4000(){
        assertEquals(4000, netBalanceCalculations.onWeekdayBalance(room, 2));
    }

    @Test
    public void
    deluxe_room_one_weekday_should_be_pay_4000(){
        DeluxeRoom room = new DeluxeRoom();
        assertEquals(4000, netBalanceCalculations.onWeekdayBalance(room, 1));
    }
}
