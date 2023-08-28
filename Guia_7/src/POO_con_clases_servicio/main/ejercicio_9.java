package POO_con_clases_servicio.main;

import POO_con_clases_servicio.entidades.Matematica;
import POO_con_clases_servicio.servicios.MatematicaService;

public class ejercicio_9 {
    public static void main(String[] args) {
        MatematicaService ms = new MatematicaService();
        Matematica m = ms.llenarNumeros();
        System.out.println("Mayor: " + ms.devolverMayor(m));
        System.out.println("Potencia: " + ms.calcularPotencia(m));
        System.out.println("Raiz: " + ms.calcularRaiz(m));
    }
}
