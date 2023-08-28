package POO_con_clases_servicio.entidades;

import java.util.Arrays;

public class Movil {
    private String marca;
    private String modelo;
    private int precio;
    private int memoriaRAM;
    private int almacenamiento;
    private int[] codigo = new int[7];

    public Movil(){}
    public Movil(String marca, String modelo, int precio, int memoriaRAM, int almacenamiento, int[] codigo){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", memoriaRAM=" + memoriaRAM +
                ", almacenamiento=" + almacenamiento +
                ", codigo=" + Arrays.toString(codigo) +
                '}';
    }
}
