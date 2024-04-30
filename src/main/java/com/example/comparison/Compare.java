package com.example.comparison;

public class Compare {

    int unit;

    public Compare(int unit) {

        if(unit <=0)
            throw new IllegalArgumentException();

        this.unit = unit;
    }


    public Boolean isEqual(int givenUnit) {
        if(unit == givenUnit)
            return true;
        else
            return false;
    }
}
