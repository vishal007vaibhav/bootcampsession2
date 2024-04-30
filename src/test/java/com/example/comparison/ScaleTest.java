package com.example.comparison;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaleTest {


    @Test
     void bothValuesAreEqual() {

        Scale scaleLhs = new Scale(1,"cm");
        Scale scaleRhs = new Scale(1,"cm");

        assertEquals(scaleLhs,scaleRhs);

    }

    @Test
    void bothValuesAreNotEqual() {

        Scale scaleLhs = new Scale(1,"cm");
        Scale scaleRhs = new Scale(2,"cm");

       assertNotEquals(scaleLhs,scaleRhs);

    }

    @Test
    void invalidValues() {

        assertThrows(IllegalArgumentException.class,() -> {
           new Scale(-1,"cm").equals(new Scale(-1,"cm"));
        });

    }

    @Test
    void OnecmPlusOnecmEqualsTwocm(){

        Scale measurement = new Scale(1,"cm");
        Scale expectedMeasurement = new Scale(2,"cm");

        Scale result = measurement.selfAdittion(measurement);

        assertEquals(expectedMeasurement,result);

    }


    @Test
    void OnecmPlusOnecmNotEqualsFourcm(){

        Scale measurement = new Scale(1,"cm");
        Scale expectedMeasurement = new Scale(4,"cm");

        Scale result = measurement.selfAdittion(measurement);

        assertNotEquals(expectedMeasurement,result);

    }

    @Test
    void OneMeterEqualsHundredCm(){
        Scale measurement1 = new Scale(1,"m");
        Scale measurement2 = new Scale(100,"cm");

        assertTrue(Scale.conversionIsEqual(measurement1,measurement2));
    }


    @Test
    void HundredCmEqualsOneMeter(){
        Scale measurement1 = new Scale(100,"cm");
        Scale measurement2 = new Scale(1,"m");

        assertTrue(Scale.conversionIsEqual(measurement1,measurement2));
    }


}