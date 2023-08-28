package POO_con_clases_servicio.main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicio_10 {
    public static void main(String[] args) {

        double a[] = new double[50], b[] = new double[20];

        for (int i=0; i<50; i++){
            a[i] = Math.round(Math.random()*10);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Arrays.sort(a);
        for (int i = 0; i<20; i++){
            if (i<10){
                b[i] = a[i];
            }else b[i] = 0.5;
        }
        for (int i = 0; i<50; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i<20; i++){
            System.out.print(b[i] + " ");
        }
    }
}
