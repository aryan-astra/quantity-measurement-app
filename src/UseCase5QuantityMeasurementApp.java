public class UseCase5QuantityMeasurementApp {
    private enum Unit {
        INCH(1.0),
        FEET(12.0),
        YARD(36.0);

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

        private double convertTo(Unit target) {
            double inInches = value * unit.inchesFactor;
            return inInches / target.inchesFactor;
        }
    }

    public static void main(String[] args) {
        Quantity length = new Quantity(3, Unit.YARD);
        double inFeet = length.convertTo(Unit.FEET);

        System.out.println("UC5 - Unit Conversion Same Type");
        System.out.println("3 yards in feet: " + inFeet);

        System.out.println("\nSample output complete for UC5.");
    }
}
