package POO_con_clases_servicio.servicios;

import POO_con_clases_servicio.entidades.NIF;

import java.util.Scanner;

public class NIFService {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public NIFService(){}

    public NIF crearNif(){
        long dni;
        String letra;
        String[] letras = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        System.out.println("Ingresa el DNI: ");
        dni = entrada.nextLong();
        letra = letras[(int) (dni % 23)];
        return new NIF(dni, letra);
    }

    public void mostrar(NIF object){
        System.out.println("NIF: " + object.getDni() +
                " - " + object.getLetra());
    }
}
