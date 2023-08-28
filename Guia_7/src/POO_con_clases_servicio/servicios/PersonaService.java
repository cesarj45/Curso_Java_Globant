package POO_con_clases_servicio.servicios;

import POO_con_clases_servicio.entidades.Persona;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PersonaService {

    public PersonaService(){}
    private Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        int year, month, day;
        String nombre;
        System.out.println("Ingresa el Nombre: ");
        nombre = entrada.next();
        System.out.println("Ingresa el Año de nacimiento: ");
        year = entrada.nextInt();
        System.out.println("Ingresa el Mes de nacimiento: ");
        month = entrada.nextInt();
        System.out.println("Ingresa el Dia de nacimiento: ");
        day = entrada.nextInt();
        Date fechaN = new Date(year-1900,month-1,day);
        return new Persona(nombre,fechaN);
    }

    public int calcularEdad(Persona objeto){
        int year, month, day, edad;
        Date fechaN = objeto.getFechaNacimiento();
        Date fechaA = new Date();
        Calendar c = new GregorianCalendar();
        c.setTime(fechaN);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DATE);
        c.setTime(fechaA);
        if ((c.get(Calendar.MONTH)==month && day>=c.get(Calendar.DATE)) || c.get(Calendar.MONTH)>month ){
            edad = (c.get(Calendar.YEAR) - year);
        }  else edad = (c.get(Calendar.YEAR) - year) - 1;
        return edad;
    }

    public boolean menorQue(int edad, Persona objeto){

        if(calcularEdad(objeto)<edad){
            return true;
        }else return false;
    }

    public void mostrarPersona(Persona objeto){
        System.out.println(
                "Nombre: " +objeto.getNombre() + "\n" +
                "Fecha de Nacimiento: " +objeto.getFechaNacimiento() + "\n" +
                "Edad : " + calcularEdad(objeto) + "\n"
        );
    }
}
