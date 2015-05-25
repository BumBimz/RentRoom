import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetBalanceCalculationsTest {
    StandardRoom room = new StandardRoom();
    NetBalanceCalculations netBalanceCalculations = new NetBalanceCalculations();

    @Test
    public void
    standard_room_on_many_weekday(){
        assertEquals(2000, netBalanceCalculations.onWeekdayBalance(room, 1));
        assertEquals(4000, netBalanceCalculations.onWeekdayBalance(room, 2));
    }

    @Test
    public void
    deluxe_room_one_weekday_should_be_pay_4000(){
        DeluxeRoom room = new DeluxeRoom();
        assertEquals(4000, netBalanceCalculations.onWeekdayBalance(room, 1));
    }

    @Test
    public void
    standard_room_on_many_weekend() {
        assertEquals(2500,netBalanceCalculations.onWeekendBalance(room, 1));
        assertEquals(7500,netBalanceCalculations.onWeekendBalance(room,3));
    }

    @Test
    public void
    deluxe_room_one_weekend_should_be_pay_4500(){
        DeluxeRoom room = new DeluxeRoom();
        assertEquals(4500, netBalanceCalculations.onWeekendBalance(room, 1));
    }
}
