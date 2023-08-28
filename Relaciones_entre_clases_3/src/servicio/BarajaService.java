package servicio;

import entidad.Baraja;
import entidad.Carta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BarajaService {

    public Baraja crearBaraja(){
        return new Baraja();
    }

    public void barajar(Baraja object){

        Collections.shuffle(object.getBaraja());
    }
    public void siguienteCarta(Baraja object){
        ArrayList<Carta> cartasDisp = object.getBaraja();
        ArrayList<Carta> cartasNoDisp = object.getCartasdadas();
        if (cartasNoDisp.size() < 40){
            cartasNoDisp.add(cartasDisp.get(0));
            System.out.println("Siguiente carta: " + cartasDisp.get(0).toString());
            cartasDisp.remove(0);
        }else {
            System.out.println("No hay mas cartas.");
        }
    }

    public void cartasDisponibles(Baraja object){
        ArrayList<Carta> cartasDisp = object.getBaraja();
        System.out.println("Cartas Disponibles: "+ cartasDisp.size());
    }

    public void darCartas(Baraja object, int cuantasDar){
        ArrayList<Carta> cartasDisp = object.getBaraja();
        ArrayList<Carta> cartasNoDisp = object.getCartasdadas();

        if (cartasDisp.size()<cuantasDar){
            System.out.println("No hay cartas suficientes.");
        }else {
            for (int i = 0; i<cuantasDar; i++){
                cartasNoDisp.add(cartasDisp.get(0));
                System.out.println("Carta "+ (i+1) +": " + cartasDisp.get(0).toString());
                cartasDisp.remove(0);
            }
        }
    }

    public void cartasMonton(Baraja object){
        ArrayList<Carta> cartasNoDisp = object.getCartasdadas();
        if (cartasNoDisp.isEmpty()){
            System.out.println("No ha salido ninguna carta.");
        }else{
            for (Carta carta: cartasNoDisp) {
                System.out.println(carta.toString());
            }
        }
    }

    public void mostrarBaraja(Baraja object){
        ArrayList<Carta> baraja = object.getBaraja();
        for (Carta carta: baraja) {
            System.out.println(carta.toString());
        }
    }

}
