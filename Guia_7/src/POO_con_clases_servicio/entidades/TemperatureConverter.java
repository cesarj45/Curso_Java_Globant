package POO_con_clases_servicio.entidades;

public class TemperatureConverter {

    public static double  celsiustoKelvin(double celsius){

        return (Math.round((celsius + 273.15) * 100))/100.00;
    }
    public static double   kelvintoCelcius(double kelvin){

        return (Math.round((kelvin - 273.15) * 100))/100.00;
    }
    public static double  fahrenheittoCelsius (double fahrenheit){

        return (fahrenheit - 32)*(5.0/9.0);
    }
    public static double  celsiustoFahrenheit  (double celsius){

        return ((celsius*1.8) + 32);
    }
    public static double  fahrenheittoKelvin  (double fahrenheit){

        return (fahrenheit- 32) * (5.0/9.0) + 273.15;
    }
    public static double  kelvintoFahrenheit  (double kelvin){

        return (kelvin - 273.15) * (9.0/5.0) + 32;
    }
}
