package POO_con_clases_servicio.main;

import POO_con_clases_servicio.entidades.Raices;
import POO_con_clases_servicio.servicios.RaicesService;

public class ejercicio_extra_3 {
    public static void main(String[] args) {
        RaicesService rs = new RaicesService();
        Raices r1 = rs.ingresarValores();
        //rs.obtenerRaices(r1);
        //rs.obtenerRaiz(r1);
        rs.calcular(r1);
    }
}
