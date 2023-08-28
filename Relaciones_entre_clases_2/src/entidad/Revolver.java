package entidad;

public class Revolver {
    private Integer posicionDispara;
    private Integer posicionAgua;

    public Revolver() {

    }

    public void llenarRevolver(){
        posicionDispara = (int) (Math.random()* 6)+1;
        posicionAgua = (int) (Math.random()* 6)+1;
    }

    public boolean mojar(){
        if (posicionAgua == posicionDispara){
            return true;
        }else return false;
    }

    public void siguienteChorro(){
        if(posicionDispara == 6){
            posicionDispara = 1;
        }else posicionDispara++;
    }

    public Integer getPosicionDispara() {
        return posicionDispara;
    }

    public void setPosicionDispara(Integer posicionDispara) {
        this.posicionDispara = posicionDispara;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "posicionDispara=" + posicionDispara +
                ", posicionAgua=" + posicionAgua +
                '}';
    }
}
