public class UseCase2QuantityMeasurementApp {
    private static boolean areEqual(double feet, double inches) {
        double inchesAsFeet = inches / 12.0;
        return Double.compare(feet, inchesAsFeet) == 0;
    }

    public static void main(String[] args) {
        double oneFoot = 1.0;
        double twelveInches = 12.0;

        System.out.println("UC2 - Feet-Inches Equality");
        System.out.println("1.0 ft equals 12.0 in: " + areEqual(oneFoot, twelveInches));

        System.out.println("\nSample output complete for UC2.");
    }
}
