public class NetBalanceCalculations {
    private int breakfast;

    public int onWeekdayBalance(Room room, int numberOfTheDay) {
        return (room.getAmountWeekday() + this.breakfast) * numberOfTheDay;
    }

    public int onWeekendBalance(Room room, int numberOfTheDay) {
        return room.getAmountWeekend() * numberOfTheDay;
    }

    public void reserveBreakfast() {
        this.breakfast = 450;
    }
}
