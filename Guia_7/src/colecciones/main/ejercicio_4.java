package colecciones.main;

import colecciones.entidad.Pelicula;
import colecciones.servicio.PeliculaService;

public class ejercicio_4 {
    public static void main(String[] args) {
        PeliculaService ps = new PeliculaService();
        ps.crearPeliculas();
        ps.mostrarPeliculas();
        ps.mostrarPeliculasMasDeUnaHora();
        ps.mostrarPeliculasDuracionDesc();
        ps.mostrarPeliculasDuracionAsc();
        ps.mostrarPeliculasOrdenTitulo();
        ps.mostrarPeliculasOrdenDirector();
    }
}
