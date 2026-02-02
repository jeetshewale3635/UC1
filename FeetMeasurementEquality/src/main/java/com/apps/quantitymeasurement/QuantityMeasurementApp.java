package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public  static boolean demonstrateLengthEquality(Length length1, Length length2){
        return length1.equals(length2);
    }

    public static void demonstrateFeetEquality(){
        Length l1 = new Length(1, Length.LengthUnit.FEET);
        Length l2 = new Length(1, Length.LengthUnit.FEET);

        System.out.println("Quantity (1, Foot) and Quantity(1, Foot) are Equal : "+demonstrateLengthEquality(l1, l2));
    }

    public static void demonstrateInchesEquality(){
        Length l1 = new Length(1, Length.LengthUnit.INCHES);
        Length l2 = new Length(1, Length.LengthUnit.INCHES);

        System.out.println("Quantity (1, Inches) and Quantity(1, Inches) are Equal : "+demonstrateLengthEquality(l1, l2));
    }

    public static void demonstrateFeetInchesComparison(){
        Length l1 = new Length(1, Length.LengthUnit.FEET);
        Length l2 = new Length(12, Length.LengthUnit.INCHES);

        System.out.println("Quantity (1, Foot) and Quantity(12, Inches) are Equal : "+demonstrateLengthEquality(l1, l2));
    }


    public static void main(String[] args){
        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateFeetInchesComparison();
    }
}
