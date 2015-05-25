import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetBalanceCalculationsTest {
    NetBalanceCalculations netBalanceCalculations = new NetBalanceCalculations();

    @Test
    public void
    standard_room_on_many_weekday(){
        StandardRoom room = new StandardRoom();
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
    standard_room_one_weekend_should_be_pay_2500() {
        StandardRoom room = new StandardRoom();
        assertEquals(2500,netBalanceCalculations.onWeekendBalance(room,1));
    }
}
