package com.example.comparison;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaleTest {


    @Test
     void bothValuesAreEqual() {

        Scale scaleLhs = new Scale(1);
        Scale scaleRhs = new Scale(1);

        assertEquals(scaleLhs,scaleRhs);

    }

    @Test
    void bothValuesAreNotEqual() {

        Scale scaleLhs = new Scale(1);
        Scale scaleRhs = new Scale(2);

       assertNotEquals(scaleLhs,scaleRhs);

    }

    @Test
    void invalidValues() {

        assertThrows(IllegalArgumentException.class,() -> {
           new Scale(-1).equals(new Scale(-1));
        });

    }


}