public class UseCase1QuantityMeasurementApp {
    private static class LengthInFeet {
        private final double feet;

        private LengthInFeet(double feet) {
            this.feet = feet;
        }

        private boolean isEqual(LengthInFeet other) {
            return Double.compare(this.feet, other.feet) == 0;
        }
    }

    public static void main(String[] args) {
        LengthInFeet a = new LengthInFeet(5.0);
        LengthInFeet b = new LengthInFeet(5.0);

        System.out.println("UC1 - Feet Equality");
        System.out.println("5.0 ft equals 5.0 ft: " + a.isEqual(b));

        System.out.println("\nSample output complete for UC1.");
    }
}
