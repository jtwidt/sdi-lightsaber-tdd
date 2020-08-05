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

    @Test
    public void initializesWithJediSerialNumber() {
        //Setup
        LightSaber lightSaber = new LightSaber(12345);

        //Execution
        long expected = 12345;
        long actual = lightSaber.getJediSerialNumber();

        //Assertion
        assertEquals(expected, actual);
    }

    @Test
    public void initialLightSaberColorIsGreen() {
        //Setup
        LightSaber lightSaber = new LightSaber(12345);

        //Execution
        String expected = "green";
        String actual = lightSaber.getColor();

        //Assertion
        assertEquals(expected, actual);
    }

    @Test
    public void initializesWith300MinutesUsage() {
        //Setup
        LightSaber lightSaber = new LightSaber(12345);

        //Execution
        float expected = 300.0f;
        float actual = lightSaber.getRemainingMinutes();

        //Assertion
        assertEquals(expected, actual);
    }

    @Test
    public void canChangeColorOfLightSaber() {
        //Setup
        LightSaber lightSaber = new LightSaber(12345);

        //Execution
        String expected = "blue";
        lightSaber.setColor("blue");
        String actual = lightSaber.getColor();

        //Assertion
        assertEquals(expected, actual);
    }
}
