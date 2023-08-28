package POO_con_clases_servicio.main;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
        int year, month, day;
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa el Año: ");
        year = entrada.nextInt();

        System.out.println("Ingresa el Mes: ");
        month = entrada.nextInt();

        System.out.println("Ingresa el Dia: ");
        day = entrada.nextInt();

        Date fecha = new Date(year,month,day);
        Date fechaActual = new Date();
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fechaActual);
        System.out.println("La fecha ingresada " +year+"/"+month+"/"+day+ " y la fecha actual " +calendario.get(Calendar.YEAR) +"/"+ calendario.get(Calendar.MONTH) +"/"+calendario.get(Calendar.DATE) + " tienen una diferencia de: ");
        System.out.println("Años: " + Math.abs(year - calendario.get(Calendar.YEAR)));
        System.out.println("Meses: " + Math.abs(month - calendario.get(Calendar.MONTH)));
        System.out.println("Dias: " + Math.abs(day - calendario.get(Calendar.DATE)));
    }
}
