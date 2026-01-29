package com.example;

import org.example.QuantityMeasurementApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    public static class Foot{
        private final double value;

        public Foot(double value) {
            this.value = value;
        }
    }

    @Test
    public void testFeetEquality_SameValue(){

        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(1.0);

        assertEquals(f1, f2); //same value

    }

    @Test
    public void testFeetEquality_DifferentValue(){
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f3 = new QuantityMeasurementApp.Feet(3.0);

        assertNotEquals(f1, f3); // different value
    }

    @Test
    public void testFeetEquality_NullComparision(){
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f4 = null;

        assertNotEquals(f1, f4); // null check
    }

    @Test
    public void testFeetEquality_SameReference(){
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);

        assertEquals(f1, f1); // same reference
    }

    @Test
    public void testFeetEquality_DifferentClass(){
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        Foot foot = new Foot(1.0);

        assertNotEquals(f1, foot); // different classes
    }
}
