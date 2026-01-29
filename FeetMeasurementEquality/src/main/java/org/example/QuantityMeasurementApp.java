package org.example;

import java.util.Objects;

public class QuantityMeasurementApp {

    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Feet feetObj = (Feet) obj;

            int comValue = Double.compare(value, feetObj.value);

            return comValue == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }



    public static void main(String[] args) {

        Feet f1 = new Feet(1.1);
        Feet f2 = new Feet(1.1);

        System.out.println(f1.equals(f2));

    }
}
