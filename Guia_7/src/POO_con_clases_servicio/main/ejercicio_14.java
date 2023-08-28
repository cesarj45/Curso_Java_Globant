package POO_con_clases_servicio.main;

import POO_con_clases_servicio.entidades.Movil;
import POO_con_clases_servicio.servicios.MovilService;

public class ejercicio_14 {
    public static void main(String[] args) {
        MovilService ms = new MovilService();
        Movil movil1 = ms.cargarCelular();
        System.out.println(movil1.toString());
    }
}
