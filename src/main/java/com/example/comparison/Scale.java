package com.example.comparison;

public class Scale {

    int value;

    public Scale(int value) {

        if(value <=0)
            throw new IllegalArgumentException();

        this.value = value;
    }


    public Boolean isEqual(int givenValue) {
        if(value == givenValue)
            return true;
        else
            return false;
    }
}
