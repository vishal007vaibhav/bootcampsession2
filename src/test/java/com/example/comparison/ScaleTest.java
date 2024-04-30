package com.example.comparison;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaleTest {


    @Test
     void bothValuesAreEqual() {

        Scale scale = new Scale(1);

        Boolean result = scale.isEqual(1);

        assertTrue(result);

    }

    @Test
    void bothValuesAreNotEqual() {

        Scale scale = new Scale(2);

        Boolean result = scale.isEqual(1);

        assertFalse(result);

    }

    @Test
    void invalidValues() {

        assertThrows(IllegalArgumentException.class,() -> {
            new Scale(0).isEqual(-1);
        });

    }

}