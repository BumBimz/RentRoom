public class StandardRoom implements Room {
    @Override
    public int getAmountWeekday() {
        return 2000;
    }

    @Override
    public int getAmountWeekend() {
        return 2500;
    }
}
