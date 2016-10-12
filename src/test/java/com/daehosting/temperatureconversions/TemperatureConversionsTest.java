package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by student on 10/12/16.
 */
public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The celsius to fahrenheit conversion failed",
                celsiusToFahrenheitResult, BigDecimal.valueOf(32));

        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals("The fahrenheit to celsius conversion failed",
                fahrenheitToCelsiusResult, BigDecimal.valueOf(0));

        BigDecimal windChillToFahrenheitResult = service.windChillInFahrenheit(BigDecimal.valueOf(10),BigDecimal.valueOf(10));
        assertEquals("The wind chill to farhenheit conversion failed",
                windChillToFahrenheitResult, BigDecimal.valueOf(-9.77599993));


        BigDecimal windChillToCelsiusResult = service.windChillInCelsius(BigDecimal.valueOf(32),BigDecimal.valueOf(10));
        assertEquals("The wind chill to celsius conversion failed",
                windChillToCelsiusResult, BigDecimal.valueOf(28.31));
    }



}