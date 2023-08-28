package POO_con_clases_servicio.main;

import POO_con_clases_servicio.entidades.NIF;
import POO_con_clases_servicio.servicios.NIFService;

public class ejercicio_extra_4 {
    public static void main(String[] args) {
        NIFService ns = new NIFService();
        NIF n1 = ns.crearNif();
        ns.mostrar(n1);
    }
}
