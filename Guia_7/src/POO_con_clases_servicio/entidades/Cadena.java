package POO_con_clases_servicio.entidades;

public class Cadena {
    private String frase;

    public Cadena(){

    }

    public Cadena(String frase)
    {
        this.frase = frase;

    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }
}
