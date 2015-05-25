import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetBalanceCalculationsTest {
    @Test
    public void
    standard_room_one_weekday_should_be_pay_2000(){
        StandardRoom room = new StandardRoom();
        NetBalanceCalculations netBalanceCalculations = new NetBalanceCalculations();
        assertEquals(2000, netBalanceCalculations.onWeekdayBalance(room, 1));
    }
}
