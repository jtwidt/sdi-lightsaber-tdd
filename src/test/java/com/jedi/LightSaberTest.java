package com.jedi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightSaberTest {

    @Test
    public void initialChargeIsFull() {
        //Setup
        LightSaber lightSaber = new LightSaber(12345);

        //Execution
        float expected = 100.0f;
        float actual = lightSaber.getCharge();

        //Assertion
        assertEquals(expected, actual);
    }
}
