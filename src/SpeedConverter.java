public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            return -1;
        }
        else {
            //calculate value of miles
            kilometersPerHour = kilometersPerHour / 1.609;
            return Math.round(kilometersPerHour);
        }
    }

    public static void printConversion(double kilometersPerHour) {

        long milesPerHour = toMilesPerHour(kilometersPerHour);

        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
