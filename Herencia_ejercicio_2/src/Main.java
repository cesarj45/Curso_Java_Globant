import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Television;
import servicio.ElectrodomesticoService;

public class Main {
    public static void main(String[] args) {
        //ejercicio 3
//        Electrodomestico aparato1 = new Electrodomestico();
//        aparato1.crearElectrodomestico();
//        System.out.println(aparato1.toString());

//        Lavadora lavadora1 = new Lavadora();
//        lavadora1.crearLavadora();
//        System.out.println(lavadora1.toString());

        Television tele1 = new Television();
        tele1.crearTelevisor();
        System.out.println(tele1.toString());

    }
}