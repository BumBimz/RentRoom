public class NetBalanceCalculations {
    public int onWeekdayBalance(Room room, int numberOfTheDay) {
        return room.getAmountWeekday() * numberOfTheDay;
    }

    public int onWeekendBalance(Room room, int numberOfTheDay) {
        return 2500 * numberOfTheDay;
    }
}
