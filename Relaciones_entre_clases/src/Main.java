import entidad.Perro;
import entidad.Persona;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Frijolito", "Labrador", 5, 100);
        Perro perro2 = new Perro("Hamburguesa", "Corriente", 7, 50);

        Persona persona1 = new Persona("Cesar Eduardo", "Muñoz Rolón", 23, "MURC990820", perro1);
        Persona persona2 = new Persona("juana", "la cubana", 23, "CUBA3434533", perro2);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
}