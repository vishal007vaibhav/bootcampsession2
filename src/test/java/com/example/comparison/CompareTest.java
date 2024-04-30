package com.example.comparison;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {


    @Test
     void bothInputUnitsAreEqual() {

        Compare compare = new Compare(1);

        Boolean result = compare.isEqual(1);

        assertTrue(result);

    }

    @Test
    void bothInputUnitsAreNotEqual() {

        Compare compare = new Compare(2);

        Boolean result = compare.isEqual(1);

        assertFalse(result);

    }

    @Test
    void invalidInputs() {

        assertThrows(IllegalArgumentException.class,() -> {
            new Compare(0).isEqual(-1);
        });

    }


}