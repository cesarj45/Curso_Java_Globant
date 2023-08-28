import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int numplayers;
        String nombre;
        ArrayList<Jugador> jugadores = new ArrayList<>();

        System.out.println("Ingresa el numero de jugadores(1-6): ");
        numplayers = entrada.nextInt();

        if (numplayers < 1 || numplayers > 6) numplayers = 6;

        for (int i=1; i<=numplayers; i++){
            nombre = "Jugador "+ i;
            jugadores.add(new Jugador(i, nombre,false));
        }

        Juego juego = new Juego();
        juego.llenarJuego(jugadores, new Revolver());
        juego.ronda();

    }
}