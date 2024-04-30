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
    void OneCmPlusOneCmEqualsTwoCm(){

        Scale measurement = new Scale(1,"cm");
        Scale expectedMeasurement = new Scale(2,"cm");

        Scale result = measurement.selfAddition(measurement);

        assertEquals(expectedMeasurement,result);

    }


    @Test
    void OneCmPlusOneCmNotEqualsFourCm(){

        Scale measurement = new Scale(1,"cm");
        Scale expectedMeasurement = new Scale(4,"cm");

        Scale result = measurement.selfAddition(measurement);

        assertNotEquals(expectedMeasurement,result);

    }

    @Test
    void OneMeterEqualsHundredCm(){
        Scale measurement1 = new Scale(1,"m");
        Scale measurement2 = new Scale(100,"cm");

        assertTrue(Scale.checkEquality(measurement1,measurement2));
    }


    @Test
    void HundredCmEqualsOneMeter(){
        Scale measurement1 = new Scale(100,"cm");
        Scale measurement2 = new Scale(1,"m");

        assertTrue(Scale.checkEquality(measurement1,measurement2));
    }

    @Test
    void HundredcentimeterEqualsOneMeter(){
        Scale measurement1 = new Scale(100,"centimeter");
        Scale measurement2 = new Scale(1,"m");

        assertTrue(Scale.checkEquality(measurement1,measurement2));
    }

    @Test
    void OneMPlusHundredCmEquals200Cm(){

        Scale measurement1 = new Scale(100,"cm");
        Scale measurement2 = new Scale(1,"m");

        Scale expectedResult = new Scale(200,"cm");

        Scale result = Scale.convertandAdd(measurement1, measurement2);

        assertEquals(result,expectedResult);



    }

    @Test
    void OneMPlusHundredCmEquals2M(){

        Scale measurement1 = new Scale(1,"m");
        Scale measurement2 = new Scale(100,"cm");

        Scale expectedResult = new Scale(2,"m");
       // Scale expectedResult = new Scale(200,"cm");

        Scale result = Scale.convertandAdd(measurement1, measurement2);

        assertEquals(result,expectedResult);


    }


}