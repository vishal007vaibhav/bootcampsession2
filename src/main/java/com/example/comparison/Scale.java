package com.example.comparison;

import java.util.Objects;

public class Scale {

    int value;
    String unit;

    public Scale(int value, String unit) {

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

    public Scale selfAdittion(Scale scale){
        return new Scale(scale.value+ scale.value,scale.unit );
    }

    static Boolean conversionIsEqual(Scale measurement1 , Scale measurement2){

       if(measurement1.unit.equals("cm")){

           return ((measurement2.value * 100) == measurement1.value);

       }

       else
           return ((measurement1.value * 100) == measurement2.value);

   }
}
