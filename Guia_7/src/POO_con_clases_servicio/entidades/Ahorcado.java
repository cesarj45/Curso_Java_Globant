package POO_con_clases_servicio.entidades;

public class Ahorcado {
    private String[] palabra, palabraclon;
    private int nletras;
    private int letrasEncotradas;
    private int jugadas;

    public Ahorcado(String [] palabra, int nletras, int jugadas, int letrasEncotradas, String[] palabraclon){
        this.palabra = palabra;
        this.nletras = nletras;
        this.jugadas = jugadas;
        this.letrasEncotradas = letrasEncotradas;
        this.palabraclon = palabraclon;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getNletras() {
        return nletras;
    }

    public void setNletras(int nletras) {
        this.nletras = nletras;
    }

    public int getLetrasEncotradas() {
        return letrasEncotradas;
    }

    public void setLetrasEncotradas(int letrasEncotradas) {
        this.letrasEncotradas = letrasEncotradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public String[] getPalabraclon() {
        return palabraclon;
    }

    public void setPalabraclon(String[] palabraclon) {
        this.palabraclon = palabraclon;
    }
}
