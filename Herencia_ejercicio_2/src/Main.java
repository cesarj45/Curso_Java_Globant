import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Television;
import servicio.ElectrodomesticoService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ejercicio 3
//        Electrodomestico aparato1 = new Electrodomestico();
//        aparato1.crearElectrodomestico();
//        System.out.println(aparato1.toString());

//        Lavadora lavadora1 = new Lavadora();
//        lavadora1.crearLavadora();
//        System.out.println(lavadora1.toString());

//        Television tele1 = new Television();
//        tele1.crearTelevisor();
//        System.out.println(tele1.toString());

        ArrayList<Electrodomestico> listaElectro = new ArrayList<>();
        listaElectro.add(new Electrodomestico(0, "AZUL", 'F', 25));
        listaElectro.add(new Lavadora(0, "ROJO", 'F', 50,500));
        listaElectro.add(new Television(0, "NEGRO", 'A', 25, 50, true));

        double total = 0;
        for (Electrodomestico electro: listaElectro) {
            electro.precioFinal();
            System.out.println(electro.getPrecio());
            total += electro.getPrecio();
        }
        System.out.println("Precio total de la Lista: " + total);

    }
}