package colecciones.entidad;

import java.util.Comparator;

public class Pelicula {
    private String titulo;
    private String director;
    private double duracion;

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                '}';
    }

    public static Comparator<Pelicula> PeliculaDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Double.compare(p2.getDuracion(), p1.getDuracion());
        }
    };
    public static Comparator<Pelicula> PeliculaDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Double.compare(p1.getDuracion(), p2.getDuracion());
        }
    };
    public static Comparator<Pelicula> PeliculaOrdenTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    public static Comparator<Pelicula> PeliculaOrdenDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };


}
