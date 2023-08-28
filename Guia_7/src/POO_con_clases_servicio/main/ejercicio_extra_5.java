package POO_con_clases_servicio.main;

import java.util.Scanner;

public class ejercicio_extra_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        String [] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        String mesSecreto = meses[7], mes;
        System.out.println("Ingresa el mes en minusculas: ");
        mes = entrada.next();
        if(mesSecreto.equals(mes)){
            System.out.println("Ha acertado!");
        }else System.out.println("No ha acertado, intente adivinarlo introduciendo el mes: " + mesSecreto);

    }
}
