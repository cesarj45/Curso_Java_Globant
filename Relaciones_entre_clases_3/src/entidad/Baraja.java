package entidad;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> baraja = new ArrayList<>();
    private ArrayList<Carta> cartasdadas = new ArrayList<>();

    public Baraja(){
        int x=1;
        for(int i=0; i<10; i++){
            if (x==8){
                x = 10;
                baraja.add(new Carta(x,"Espadas"));
                baraja.add(new Carta(x,"Bastos"));
                baraja.add(new Carta(x,"Oros"));
                baraja.add(new Carta(x,"Copas"));
                x++;
            }else {
                baraja.add(new Carta(x,"Espadas"));
                baraja.add(new Carta(x,"Bastos"));
                baraja.add(new Carta(x,"Oros"));
                baraja.add(new Carta(x,"Copas"));
                x++;
            }
        }
    }
    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getCartasdadas() {
        return cartasdadas;
    }

    public void setCartasdadas(ArrayList<Carta> cartasdadas) {
        this.cartasdadas = cartasdadas;
    }

}
