package colecciones.main;

import colecciones.servicio.PaisService;

public class ejercicio_5 {
    public static void main(String[] args) {
        PaisService ps = new PaisService();
        ps.leerYGuardarPaises();
        ps.ordenarPaises();
        ps.eliminarPais();
    }
}
