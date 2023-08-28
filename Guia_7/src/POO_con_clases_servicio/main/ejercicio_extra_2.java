package POO_con_clases_servicio.main;

import POO_con_clases_servicio.servicios.PuntosService;
import POO_con_clases_servicio.entidades.Puntos;
public class ejercicio_extra_2 {
    public static void main(String[] args) {
        PuntosService ps = new PuntosService();
        Puntos p1 = ps.crearPuntos();
        System.out.println(ps.calcularDistancia(p1));

    }
}
