public class UseCase3QuantityMeasurementApp {
    private enum Unit {
        INCH(1.0),
        FEET(12.0);

        private final double inchesFactor;

        Unit(double inchesFactor) {
            this.inchesFactor = inchesFactor;
        }
    }

    private static class Quantity {
        private final double value;
        private final Unit unit;

        private Quantity(double value, Unit unit) {
            this.value = value;
            this.unit = unit;
        }

        private double toInches() {
            return value * unit.inchesFactor;
        }

        private boolean isEqual(Quantity other) {
            return Double.compare(this.toInches(), other.toInches()) == 0;
        }
    }

    public static void main(String[] args) {
        Quantity q1 = new Quantity(2, Unit.FEET);
        Quantity q2 = new Quantity(24, Unit.INCH);

        System.out.println("UC3 - Generic Quantity Class DRY");
        System.out.println("2 feet equals 24 inches: " + q1.isEqual(q2));

        System.out.println("\nSample output complete for UC3.");
    }
}
