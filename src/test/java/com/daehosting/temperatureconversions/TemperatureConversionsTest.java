package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by tolly on 2/28/2017.
 */
public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The celsius to Fahrenheit conversion failed",
                celsiusToFahrenheitResult, BigDecimal.valueOf(32));
    }

    @Test
    public void testFahrenheitToCelsius() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32.0));
        assertEquals("The fahrenheit to celsius conversion failed",
                fahrenheitToCelsiusResult, BigDecimal.valueOf(0));
    }

    @Test
    public void testWindChillInCelsius() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInCelsius = service.windChillInCelsius(BigDecimal.valueOf(5.0), BigDecimal.valueOf(5.0));
        assertEquals("The windchill in celcius calculator failed",
                windChillInCelsius, BigDecimal.valueOf(1.2725));

    }

    @Test public void testWindChillInFahrenheit() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInFahrenheit = service.windChillInFahrenheit(BigDecimal.valueOf(50.0), BigDecimal.valueOf(5.0));
        assertEquals("The windchill in celcius calculator failed",
                windChillInFahrenheit, BigDecimal.valueOf(43.943));
    }
}