package entidad;

public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora(){}

    public Lavadora(int precio, String color, char consumo, int peso, int carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public void crearLavadora(){
        crearElectrodomestico();
        System.out.println("Ingrese la cantidad de carga: ");
        this.carga = entrada.nextInt();
        precioFinal();
    }
    public void precioFinal(){
        super.precioFinal();
        if (carga>30){
            precio+=500;
        }
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }
}
