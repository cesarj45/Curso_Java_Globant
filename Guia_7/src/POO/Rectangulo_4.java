package POO;

public class Rectangulo_4 {
    private double base;
    private double altura;

    public void crearRectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularSuperficie(){
        return base * altura;
    }
    public double calcularPerimetro(){
        return (base + altura) * 2;
    }
    public void dibujarRectangulo(){
        for (int i = 0; i<altura; i++){
            for (int j = 0; j<base; j++){
                if (i == 0 || j == 0 || i == altura-1 || j == base-1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}
