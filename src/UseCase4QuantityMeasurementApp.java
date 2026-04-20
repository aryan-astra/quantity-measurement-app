public class UseCase4QuantityMeasurementApp {
    private enum Unit {
        INCH(1.0),
        FEET(12.0),
        CENTIMETER(0.393700787),
        METER(39.3700787);

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
            return Math.abs(this.toInches() - other.toInches()) < 0.0001;
        }
    }

    public static void main(String[] args) {
        Quantity oneMeter = new Quantity(1, Unit.METER);
        Quantity hundredCentimeters = new Quantity(100, Unit.CENTIMETER);

        System.out.println("UC4 - Extended Unit Support");
        System.out.println("1 meter equals 100 centimeters: " + oneMeter.isEqual(hundredCentimeters));

        System.out.println("\nSample output complete for UC4.");
    }
}
