package POO_con_clases_servicio.servicios;

import POO_con_clases_servicio.entidades.Ahorcado;

import java.util.Scanner;

public class AhorcadoService {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public AhorcadoService(){}

    public Ahorcado crearJuego(){
        String palabra;
        int intentos;
        System.out.println("Ingrese la palabra: ");
        palabra = entrada.next();
        palabra = palabra.toUpperCase();
        System.out.println("Ingrese el numero de jugadas: ");
        intentos = entrada.nextInt();

        String [] palabraclon= new String[palabra.length()], palabraarray = new String[palabra.length()];
        for (int i = 0; i<palabra.length(); i++){
            palabraarray[i] = palabra.substring(i,i+1);
            palabraclon[i] = "";
        }

        return new Ahorcado(palabraarray, palabra.length(), intentos,0, palabraclon);
    }
    public void longitud(Ahorcado object){
        String [] palabra = object.getPalabra(), palabraclon = object.getPalabraclon();

        System.out.println("\nLongitud de la palabra: "+ object.getNletras());
        for (int i = 0; i<object.getNletras(); i++){
            if (palabra[i].equals(palabraclon[i])){
                System.out.print(palabra[i] + " ");
            }else System.out.print("_ ");
        }
        System.out.println("");
    }

    public void buscar(String letra, Ahorcado object){
        int vecesEncontradas=0;
        String [] palabra = object.getPalabra(), palabraclon = object.getPalabraclon();
        for (int i = 0; i<object.getNletras(); i++){
            if (palabra[i].equals(letra) && !palabraclon[i].equals(letra)){
                palabraclon[i] = palabra[i];
                vecesEncontradas++;
            }
        }
        if (vecesEncontradas > 0){
            object.setLetrasEncotradas(object.getLetrasEncotradas()+vecesEncontradas);
            System.out.println("Correcto! La letra pertenece a la palabra.");
        }else System.out.println("La letra No pertenece a la palabra.");
        System.out.println("Numero de letras (encontradas, faltantes): ("+ object.getLetrasEncotradas()+","+(object.getNletras()-object.getLetrasEncotradas())+")");
    }

    public boolean encontradas(String letra, Ahorcado object){
        int vecesEncontradas=0;
        String [] palabra = object.getPalabra(), palabraclon = object.getPalabraclon();
        for (int i = 0; i<object.getNletras(); i++){
            if (palabra[i].equals(letra)){
                vecesEncontradas++;
            }
        }
        if (vecesEncontradas > 0){
            System.out.println("Numero de oportunidades restantes: "+ object.getJugadas());
            return true;
        }else{
            object.setJugadas(object.getJugadas()-1);
            System.out.println("Numero de oportunidades restantes: "+ object.getJugadas());
            return false;
        }
    }

    public void juego(Ahorcado object){
        String letra;


        while (object.getJugadas()>0 && object.getLetrasEncotradas()<object.getNletras()) {

            longitud(object);
            do {
                System.out.println("Ingresa una letra: ");
                letra = entrada.next();
                letra = letra.toUpperCase();
                if (letra.length() != 1 || !letra.matches("[A-Z ]")) {
                    System.out.println("Ingresa solo una letra(no caracteres extraños).");
                }
            } while (letra.length() != 1 || !letra.matches("[A-Z ]"));

            buscar(letra, object);
            encontradas(letra, object);
        }
        if (object.getLetrasEncotradas() != object.getNletras()){
            System.out.println("**************************************\n" +
                               "*            Game over :(            *\n" +
                               "**************************************");
        }else System.out.println("**************************************\n" +
                                 "*            Ganaste! :)             *\n" +
                                 "**************************************");
    }
}

