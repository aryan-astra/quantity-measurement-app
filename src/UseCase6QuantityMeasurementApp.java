public class UseCase6QuantityMeasurementApp {
    private enum Unit {
        INCH(1.0),
        FEET(12.0),
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

        private static Quantity add(Quantity a, Quantity b, Unit resultUnit) {
            double totalInches = a.toInches() + b.toInches();
            double converted = totalInches / resultUnit.inchesFactor;
            return new Quantity(converted, resultUnit);
        }

        @Override
        public String toString() {
            return value + " " + unit;
        }
    }

    public static void main(String[] args) {
        Quantity first = new Quantity(2, Unit.FEET);
        Quantity second = new Quantity(24, Unit.INCH);
        Quantity total = Quantity.add(first, second, Unit.FEET);

        System.out.println("UC6 - Addition Of Two Same-Category Length Units");
        System.out.println("2 feet + 24 inches = " + total);

        System.out.println("\nSample output complete for UC6.");
    }
}
