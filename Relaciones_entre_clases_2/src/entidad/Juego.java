package entidad;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver){
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda(){
        revolver.llenarRevolver();
        boolean hayMojado = false;
        while (!hayMojado){
            for (Jugador jugador: jugadores) {
                System.out.println(revolver.toString());
                jugador.disparo(revolver);
                if (jugador.getMojado()){
                    System.out.println(jugador.getNombre()+" MOJADO! Game over.");
                    hayMojado = true;
                    break;
                }else{
                    System.out.println(jugador.getNombre()+" Carga vacia.");
                }
            }
        }

    }
}
