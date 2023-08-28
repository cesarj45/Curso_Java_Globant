package POO_con_clases_servicio.main;

import POO_con_clases_servicio.entidades.Cadena;
import POO_con_clases_servicio.servicios.CadenaService;

public class ejercicio_8 {
    public static void main(String[] args) {
        CadenaService cs = new CadenaService();
        Cadena cadena = cs.crearCadena();

        cs.mostrarVocales(cadena);
        cs.invertirFrase(cadena);
        cs.vecesRepetido(cadena, "a");
        cs.compararLongitud(cadena,"anita lava la tina");
        cs.unirFrases(cadena, " oye oye que rico oye");
        cs.remplazarA(cadena, "#");
        if (cs.contiene(cadena,"%")){
            System.out.println("si lo contiene.");
        }else System.out.println("No lo contiene.");
    }
}
