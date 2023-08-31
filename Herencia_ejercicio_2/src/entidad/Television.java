package entidad;

public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sincroTDT;

    public Television(){}

    public Television(int precio, String color, char consumo, int peso, int resolucion, boolean sincroTDT) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sincroTDT = sincroTDT;
    }

    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion(pulgadas): ");
        this.resolucion = entrada.nextInt();
        System.out.println("Ingresa si cuenta con sincronizador TDT(true/false): ");
        this.sincroTDT = entrada.nextBoolean();
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion>40){
            precio = precio * 1.3;
        }
        if (sincroTDT){
            precio+=500;
        }
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSincroTDT() {
        return sincroTDT;
    }

    public void setSincroTDT(boolean sincroTDT) {
        this.sincroTDT = sincroTDT;
    }
}
