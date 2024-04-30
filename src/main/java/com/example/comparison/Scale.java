package com.example.comparison;

import java.util.Objects;

public class Scale {

    int value;

    public Scale(int value) {

        if(value <=0)
            throw new IllegalArgumentException();

        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scale scale = (Scale) o;
        return value == scale.value;
    }


}
