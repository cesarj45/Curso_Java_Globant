import entidad.Baraja;
import servicio.BarajaService;

public class Main {
    public static void main(String[] args) {

        BarajaService bs = new BarajaService();
        Baraja baraja = bs.crearBaraja();

        bs.mostrarBaraja(baraja);
        System.out.println();

        bs.barajar(baraja);
        bs.siguienteCarta(baraja);
        System.out.println();

        bs.cartasDisponibles(baraja);
        System.out.println();

        bs.darCartas(baraja, 2);
        System.out.println();

        bs.cartasMonton(baraja);
        System.out.println();

        bs.mostrarBaraja(baraja);
        System.out.println();

        bs.cartasDisponibles(baraja);
        System.out.println();

    }
}