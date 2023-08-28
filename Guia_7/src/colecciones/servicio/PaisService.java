package colecciones.servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisService {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    HashSet<String> paises = new HashSet<>();
    String pais, pregunta;

    public void leerYGuardarPaises(){

        do {
            System.out.println("Ingresa un pais: ");
            //pais = entrada.next();
            paises.add("ITALIA");
            paises.add("MEXICO");
            paises.add("COLOMBIA");
            paises.add("ECUADOR");
            paises.add("ALEMANIA");
            //paises.add(pais);

            System.out.println("Deseas registrar otro Pais?(SI/NO): ");
            pregunta = entrada.nextLine();
            pregunta = pregunta.toUpperCase();
        }while (!pregunta.equals("N") && !pregunta.equals("NO"));

        recorrerColeccion(paises);

    }

    public  <T> void recorrerColeccion(Iterable<T> coleccion) {
        System.out.println();
        Iterator<T> iterator = coleccion.iterator();
        while (iterator.hasNext()) {
            T elemento = iterator.next();
            System.out.println(elemento);
        }
        System.out.println();
    }


    public void ordenarPaises(){
        ArrayList<String> listaPaises = new ArrayList<>(paises);
        Collections.sort(listaPaises);

        System.out.println("Paises Ordenados: ");
        recorrerColeccion(listaPaises);
    }

    public void eliminarPais(){
        Iterator<String> iterator = paises.iterator();
        String pais;
        boolean exist = false;
        System.out.println("Ingresa un pais a eliminar: ");
        pais = entrada.nextLine();
        pais = pais.toUpperCase();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals(pais)){
                iterator.remove();
                exist = true;
            }
        }
        if (exist){
            System.out.println("Se elimino "+pais+" correctamente.");
        }else System.out.println(pais + " no existe en la coleccion.");

        recorrerColeccion(paises);
    }

    //La variable de tipo comparator no es necesaria debido a que nuestra coleccion de paises es string y no objeto
    public static Comparator<String> ordenarAlfabeticamente = new Comparator<>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };

}
