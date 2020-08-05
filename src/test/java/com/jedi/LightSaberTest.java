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
    public void initializesWith600MinutesUsage() {
        //Setup
        LightSaber lightSaber = new LightSaber(12345);

        //Execution
        float expected = 600.0f;
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

    @Test
    public void useLightSaberReducesCharge() {
        //Setup
        LightSaber lightSaber = new LightSaber(12345);

        //Execution
        float expected = 50.0f;
        lightSaber.use(300.0f);
        float actual = lightSaber.getCharge();

        //Assertion
        assertEquals(expected, actual);
    }

    @Test
    public void rechargeBringsLightSaberTo100() {
        //Setup
        LightSaber lightSaber = new LightSaber(12345);

        //Execution
        float expected = 100.0f;
        lightSaber.use(300.0f);
        float usedExpected = 50.0f;
        float usedActual = lightSaber.getCharge();
        lightSaber.recharge();
        float actual = lightSaber.getCharge();

        //Assertion
        assertEquals(usedExpected, usedActual);
        assertEquals(expected, actual);
    }

    @Test
    public void setChargeToSpecificLevel(){
        //Setup
        LightSaber lightSaber = new LightSaber(12345);

        //Execution
        float expected = 75.0f;
        lightSaber.setCharge(75.0f);
        float actual = lightSaber.getCharge();

        //Assertion
        assertEquals(expected, actual);
    }
}
