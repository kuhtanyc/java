public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp (true, 1);
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {

        if (isBarking) {
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            }
            else if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            }
            else {
                return false;
            }
        } else {
            return false;
        }
    }
}
