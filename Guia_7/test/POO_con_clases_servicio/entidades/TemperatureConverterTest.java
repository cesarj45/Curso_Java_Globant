package POO_con_clases_servicio.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void celsiustoKelvin() {
        double k = TemperatureConverter.celsiustoKelvin(-48.15);
        assertEquals(225,k);
    }

    @Test
    void kelvintoCelcius() {
        double c = TemperatureConverter.kelvintoCelcius(225);
        assertEquals(-48.15,c);
    }

    @Test
    void fahrenheittoCelsius() {
        double c = TemperatureConverter.fahrenheittoCelsius(122);
        assertEquals(50,c);
    }

    @Test
    void celsiustoFahrenheit() {
        double f = TemperatureConverter.celsiustoFahrenheit(50);
        assertEquals(122,f);
    }

    @Test
    void fahrenheittoKelvin() {
        double k = TemperatureConverter.fahrenheittoKelvin(113);
        assertEquals(318.15,k);
    }

    @Test
    void kelvintoFahrenheit() {
        double f = TemperatureConverter.kelvintoFahrenheit(318.15);
        assertEquals(113,f);
    }
}