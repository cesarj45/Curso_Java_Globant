package POO;

public class Cafetera_6 {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera_6(){

    }
    public Cafetera_6(int capacidadMaxima, int cantidadActual){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
    }
    public void servirTaza(int tamanoTaza){
        if (tamanoTaza<=cantidadActual){
            cantidadActual -= tamanoTaza;
            System.out.println("Taza llena por completo.");
        }
        else {
            System.out.println("No hay suficiente cafe para llenar la taza.");
            System.out.println("Se suministro: " + cantidadActual + " ml");
            cantidadActual = 0;
        }
    }

    public void vaciarCafetera(){
        cantidadActual = 0;
    }

    public void agregarCafe(int cantidad){
        if (cantidadActual + cantidad <= capacidadMaxima){
            cantidadActual += cantidad;
        }else{
            cantidad -= (capacidadMaxima - cantidadActual) ;
            cantidadActual = capacidadMaxima;
            System.out.println("Cafetera llena, cantidad rechazada: " + cantidad);
        }
    }
}
