package entidad;

public class Jugador {
    private Integer id_jugador;
    private String nombre;
    private Boolean mojado;

    public Jugador(Integer id_jugador, String nombre, Boolean mojado) {
        this.id_jugador = id_jugador;
        this.nombre = nombre;
        this.mojado = mojado;
    }


    public void disparo(Revolver revolver){
        if (revolver.mojar()){
            mojado = true;
        }
        revolver.siguienteChorro();
    }

    public Integer getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(Integer id_jugador) {
        this.id_jugador = id_jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id_jugador=" + id_jugador +
                ", nombre='" + nombre + '\'' +
                ", mojado=" + mojado +
                '}';
    }
}
