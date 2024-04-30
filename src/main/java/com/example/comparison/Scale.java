package com.example.comparison;

import java.util.Arrays;
import java.util.Objects;

public class Scale {

    double value;
    String unit;

    public Scale(double value, String unit) {

        if(value <=0)
            throw new IllegalArgumentException();

        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scale scale = (Scale) o;
        return value == scale.value && Objects.equals(unit, scale.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    public Scale selfAddition(Scale scale){
        return new Scale(scale.value+ scale.value,scale.unit );
    }

    static Boolean checkEquality(Scale measurement1 , Scale measurement2){
        boolean isCM = isCM(measurement1.unit, CENTIMETER.values());
       if(isCM){
           return ((measurement2.value * 100) == measurement1.value);
       }

       else
           return ((measurement1.value * 100) == measurement2.value);

   }
    public static boolean isCM(String userInput, CENTIMETER[] enumValues) {
        return Arrays.stream(enumValues)
                .map(CENTIMETER::getAbbreviation)
                .anyMatch(value -> value.equalsIgnoreCase(userInput));
    }



    public static Scale convertandAdd(Scale scale1, Scale scale2){

        if(isCM(scale1.unit,CENTIMETER.values()) && !isCM(scale2.unit, CENTIMETER.values()))
            return new Scale(scale1.value + scale2.value *100 , scale1.unit );

        else if(isCM(scale1.unit,CENTIMETER.values()) && isCM(scale2.unit, CENTIMETER.values()))
            return new Scale(scale1.value + scale2.value, scale1.unit );

        else if(!isCM(scale1.unit, CENTIMETER.values()) && isCM(scale2.unit, CENTIMETER.values()))
            return new Scale(scale1.value + scale2.value/100.0, scale1.unit );

        else
            return new Scale(scale1.value + scale2.value, scale1.unit );

    }
}
