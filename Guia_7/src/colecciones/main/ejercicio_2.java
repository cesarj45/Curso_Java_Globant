package colecciones.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio_2 {
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

        System.out.println("Ingresa la raza a eliminar: ");
        String razaAeliminar = entrada.next();

        Iterator it = perritos.iterator();
        boolean exist = false;
        while (it.hasNext()){
            if (it.next().equals(razaAeliminar)){
                it.remove();
                exist = true;
            }
        }
        if (exist){
            System.out.println("Se elimino la raza "+ razaAeliminar);
        }else System.out.println("No se encontro la raza "+ razaAeliminar);

        for (String perrito: perritos) {
            System.out.println(perrito);
        }

        perritos.sort(comparaStrings);

        System.out.println("Ordenados: ");
        for (String perrito: perritos) {
            System.out.println(perrito);
        }
    }
    public static Comparator<String> comparaStrings = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    };
}
