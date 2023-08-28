package POO_con_clases_servicio.main;

import POO_con_clases_servicio.entidades.Persona;
import POO_con_clases_servicio.servicios.PersonaService;

public class ejercicio_12 {
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();
        System.out.println("La edad es: " + ps.calcularEdad(p1));

        if (ps.menorQue(30, p1)){
            System.out.println("La edad ingresada es mayor a la edad de la persona.");
        }else
            System.out.println("La edad ingresada es menor a la edad de la persona.");

        ps.mostrarPersona(p1);
    }
}
