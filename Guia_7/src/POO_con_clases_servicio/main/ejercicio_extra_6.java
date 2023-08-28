package POO_con_clases_servicio.main;

import POO_con_clases_servicio.entidades.Ahorcado;
import POO_con_clases_servicio.servicios.AhorcadoService;

public class ejercicio_extra_6 {
    public static void main(String[] args) {
        AhorcadoService as = new AhorcadoService();
        Ahorcado a1 = as.crearJuego();
        as.juego(a1);
    }
}
