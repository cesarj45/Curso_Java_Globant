package colecciones.main;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> perritos = new ArrayList<>();
        String raza, pregunta;
        do {
            System.out.println("Ingresa una raza de perro: ");
            raza = entrada.next();
            perritos.add(raza);
            System.out.println("Deseas igresar otra raza?(SI/NO): ");
            pregunta = entrada.next();
            pregunta = pregunta.toUpperCase();
        }while (!pregunta.equals("N") && !pregunta.equals("NO"));

        for (String perrito: perritos) {
            System.out.println(perrito);
        }
    }
}
