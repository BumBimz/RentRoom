public class NetBalanceCalculations {
    public int onWeekdayBalance(Room room, int numberOfTheDay) {
        return room.getAmountWeekday() * numberOfTheDay;
    }
}
