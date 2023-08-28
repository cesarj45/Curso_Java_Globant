package POO;

public class main {
    public static void main(String[] args) {

        /*//ejercicio_1
        Libro_1 l1 = new Libro_1();
        l1.cargarLibro();
        System.out.println("Info: " + l1.toString());*/

        /*//ejercicio_2
        Circunferencia_2 c1 = new Circunferencia_2(2);
        //c1.crearCircunferencia();
        System.out.println("Area: " + c1.area());
        System.out.println("Perimetro: " + c1.perimetro());*/

        /*//ejercicio_3
        Operacion_3 o1 = new Operacion_3();
        o1.crearOperacion();
        System.out.println(o1.sumar());*/

        /*//ejercicio_4
        Rectangulo_4 r1 = new Rectangulo_4();
        r1.crearRectangulo(10, 5);
        r1.dibujarRectangulo();*/

        /*//ejercicio_5
        Cuenta_5 c1 = new Cuenta_5();
        c1.crearCuenta();
        c1.retirar(100);
        c1.consultaSaldo();
        c1.ingresar(200);
        c1.consultaSaldo();
        c1.extraccionRapida();
        c1.consultaDatos();*/

        /*//ejercicio_6
        Cafetera_6 c1 = new Cafetera_6(1000, 0);
        c1.llenarCafetera();
        c1.servirTaza(900);
        c1.servirTaza(200);
        c1.agregarCafe(2000);*/

        //ejercicio_7
       int [] IMC = new int[4];
        boolean [] mayores = new boolean[4];
        int mayor=0, desnutrido=0, normales=0, gordillos=0;
        Persona_7 p1 = new Persona_7("Cesar Muñoz", 23,"H", 90, 1.78);
        Persona_7 p2 = new Persona_7("Pepito picapapas", 17,"H", 40, 1.70);
        Persona_7 p3 = new Persona_7("Laura no esta", 20,"M", 60, 1.67);
        Persona_7 p4 = new Persona_7();
        p4.crearPersona();

        IMC[0] = p1.calcularIMC();
        IMC[1] = p2.calcularIMC();
        IMC[2] = p3.calcularIMC();
        IMC[3] = p4.calcularIMC();

        for (int i = 0; i<4; i++){
            if(IMC[i] == -1){
                desnutrido++;
            } else if (IMC[i] == 0) {
                normales++;
            }else if (IMC[i] == 1){
                gordillos++;
            }
        }
        mayores[0] = p1.mayorDeEdad();
        mayores[1] = p2.mayorDeEdad();
        mayores[2] = p3.mayorDeEdad();
        mayores[3] = p4.mayorDeEdad();

        for (int i = 0; i<4; i++){
            if(mayores[i] == true){
                mayor++;
            }
        }
        System.out.println("Personas por debajo de su peso ideal: " + desnutrido);
        System.out.println("Personas en su peso ideal: " + normales);
        System.out.println("Personas por encima de su peso ideal: " + gordillos);
        System.out.println("Porcentaje de mayores de edad: " + ((100/4)*mayor)+ " %");
        System.out.println("Porcentaje de menores de edad: " + (100-((100/4)*mayor)) + " %");
        System.out.println(p4.toString());
    }
}
