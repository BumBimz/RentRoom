public class DeluxeRoom implements Room {
    @Override
    public int getAmountWeekday() {
        return 4000;
    }

    @Override
    public int getAmountWeekend() {
        return 4500;
    }
}
