package entidad;

public class Caballo extends Animal{
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    public void alimentarse(){
        System.out.println("fdrsg: "+alimento);
    }
}
