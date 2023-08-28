package colecciones.servicio;

import colecciones.entidad.Pelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    String titulo, director, pregunta;
    double duracion;
    public void crearPeliculas(){
        do {
            System.out.println("Ingresa el titulo de la pelicula: ");
            titulo = entrada.next();
            System.out.println("Ingresa el director: ");
            director = entrada.next();
            System.out.println("Ingresa la duracion: ");
            duracion = entrada.nextDouble();
            peliculas.add(new Pelicula(titulo,director,duracion));

            System.out.println("Deseas registrar otra Pelicula?(SI/NO): ");
            pregunta = entrada.next();
            pregunta = pregunta.toUpperCase();
        }while (!pregunta.equals("N") && !pregunta.equals("NO"));
    }

    public void mostrarPeliculas(){
        System.out.println("Todas las peliculas: ");
        for (Pelicula pelicula: peliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println();
    }
    public void mostrarPeliculasMasDeUnaHora(){
        System.out.println("Peliculas mayores a 1 hora: ");
        for (Pelicula pelicula: peliculas) {
            if (pelicula.getDuracion()>1)
            System.out.println(pelicula.toString());
        }
        System.out.println();
    }
    public void mostrarPeliculasDuracionDesc(){
        System.out.println("Peliculas ordenadas de mayor a menor duracion: ");
        peliculas.sort(Pelicula.PeliculaDuracionDesc);
        for (Pelicula pelicula: peliculas) {
                System.out.println(pelicula.toString());
        }
        System.out.println();
    }
    public void mostrarPeliculasDuracionAsc(){
        System.out.println("Peliculas ordenadas de menor a mayor duracion: ");
        peliculas.sort(Pelicula.PeliculaDuracionAsc);
        for (Pelicula pelicula: peliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println();
    }
    public void mostrarPeliculasOrdenTitulo(){
        System.out.println("Peliculas ordenadas alfabeticamente por el Titulo: ");
        peliculas.sort(Pelicula.PeliculaOrdenTitulo);
        for (Pelicula pelicula: peliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println();
    }

    public void mostrarPeliculasOrdenDirector(){
        System.out.println("Peliculas ordenadas alfabeticamente por el Director: ");
        peliculas.sort(Pelicula.PeliculaOrdenDirector);
        for (Pelicula pelicula: peliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println();
    }

}
